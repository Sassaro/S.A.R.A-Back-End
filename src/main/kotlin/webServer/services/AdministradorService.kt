package webServer.services

import BusinessException
import NotFoundException
import domain.Roles
import domain.Usuario
import domain.logs.BorradoCuenta
import domain.logs.CreacionDeCuenta
import domain.logs.EdicionDeCuenta
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import webServer.dto.CredencialesDTO
import webServer.dto.LoginDTO
import webServer.dto.NuevoUsuarioDTO
import webServer.repository.RepositorioUsuario
import java.time.LocalDateTime
import kotlin.jvm.optionals.getOrElse

@Service
class UsuarioService(
) {

    @Autowired
    lateinit var repositorioUsuario: RepositorioUsuario

    @Autowired
    lateinit var logService: LogService

    fun getUsuarios(): List<LoginDTO> {

        val users = repositorioUsuario.findAll().map {
            LoginDTO(it.id,it.nombreUsuario,it.rol.name)
        }

        return users
    }

    @Transactional
    fun login(credenciales:CredencialesDTO): LoginDTO {

        val user = repositorioUsuario.getAdministradorByContraseniaAndNombreUsuario(credenciales.contrasenia,credenciales.usuario).getOrElse { throw NotFoundException("El usuario o contraseña son incorrectos") }

        //ahora retorna tanto el id como el nombre y el rol del usuario
        return LoginDTO(user.id, user.nombreUsuario,user.rol.name)
    }

    @Transactional
    fun createUser(usuario:NuevoUsuarioDTO, updatedUser: LoginDTO): Boolean {
        val existe = repositorioUsuario.getUsuarioByNombreUsuario(usuario.usuario)
        val rolesMap = mapOf(
            "ADMIN" to Roles.ADMIN,
            "ASIGNADOR" to Roles.ASIGNADOR
        )

        val rol = rolesMap[usuario.tipo]

        if (existe.isEmpty && rol != null && usuario.usuario.isNullOrEmpty() === false && usuario.contrasenia.isNullOrEmpty() === false) {
            val nuevoUsuario = Usuario(usuario.usuario, usuario.contrasenia, rol)
            repositorioUsuario.save(nuevoUsuario)

            var usuarioCreado = LoginDTO(nuevoUsuario.id,nuevoUsuario.nombreUsuario,nuevoUsuario.rol.name)
            var log = CreacionDeCuenta(updatedUser,LocalDateTime.now().toString(),usuarioCreado )
            this.logService.createLog(log)

            return true
        } else {
            return false
        }
    }
    @Transactional
    fun deleteUser(idUser:Long,idUserToDelete:Long){

        val auxUser = this.repositorioUsuario.findById(idUserToDelete).orElseThrow { NotFoundException("No se ha encontraoo el usuario con Id: $idUserToDelete") }
        val user = this.repositorioUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)


        if(auxUser.rol == Roles.ADMIN && this.repositorioUsuario.countByRol(Roles.ADMIN) == 1){
            throw BusinessException("No se pueden borrar todos los administradores.")
        }else{
            this.repositorioUsuario.deleteById(idUserToDelete)
        }

        val log = BorradoCuenta(userDTO,LocalDateTime.now().toString(),LoginDTO(auxUser.id,auxUser.nombreUsuario,auxUser.rol.name))
        this.logService.createLog(log)
    }

    @Transactional
    fun updateUser(idUser: Long, updatedUser: LoginDTO) {

        val persistedUser = this.repositorioUsuario.findById(updatedUser.id).orElseThrow { throw NotFoundException("No se ha encontrado el usuario con Id: ${updatedUser.id} ") }
        val permittedUpdate  = this.repositorioUsuario.findAll().count { it.rol == Roles.ADMIN } <= 1

        if ( updatedUser.rol != Roles.ADMIN.name && persistedUser.rol == Roles.ADMIN && permittedUpdate ){
            throw BusinessException("No se puede modificar los permisos del usuario, tiene que haber por lo menos un administrador.")
        }else{
            val user = this.repositorioUsuario.findById(idUser).get()
            val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

            val log = EdicionDeCuenta(userDTO,LocalDateTime.now().toString(),LoginDTO(persistedUser.id,persistedUser.nombreUsuario,persistedUser.rol.name),updatedUser)

            this.logService.createLog(log)

            persistedUser.nombreUsuario = updatedUser.nombreUsuario
            persistedUser.rol = Roles.valueOf(updatedUser.rol)
            this.repositorioUsuario.save(persistedUser)


        }
    }

}
