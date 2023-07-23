package webServer.controllers

import domain.Usuario
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import webServer.dto.*
import webServer.services.UsuarioService

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
class UsuarioController {

    @Autowired
    lateinit var administradorService:UsuarioService

    @GetMapping
    fun getAdministradores(): List<LoginDTO> {
        return administradorService.getUsuarios()
    }

    @PostMapping("/login")
    fun loginAdmin(@RequestBody credenciales: CredencialesDTO): LoginDTO {
        return this.administradorService.login(credenciales)
    }

    @PatchMapping("/update/{idUser}")
    fun updateUser(@PathVariable idUser:Long, @RequestBody user:LoginDTO){
        this.administradorService.updateUser(idUser, user)
    }
    @PostMapping("/create")
    fun createUser(@RequestBody createUserDTO: CreateUserDTO):Boolean {
        val usuario = createUserDTO.usuario
        val user = createUserDTO.userLog
        return this.administradorService.createUser(usuario, user)
    }
    @DeleteMapping("/delete/{idUser}/{idUserToDelete}")
    fun deleteUser(@PathVariable idUser:Long, @PathVariable idUserToDelete:Long){
        this.administradorService.deleteUser(idUser, idUserToDelete)
    }

}