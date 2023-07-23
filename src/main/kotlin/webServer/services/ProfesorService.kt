package webServer.services

import BusinessException
import NotFoundException
import domain.Profesor
import domain.logs.BorradoDeProfesor
import domain.logs.CreacionDeProfesor
import domain.logs.EdicionDeProfesor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import webServer.dto.LoginDTO
import webServer.repository.RepositorioMateria
import webServer.repository.RepositorioProfesor
import webServer.repository.RepositorioUsuario
import java.time.LocalDateTime

@Service
class ProfesorService {

    @Autowired
    lateinit var repositorioProfesor: RepositorioProfesor

    @Autowired
    lateinit var repositorioMateria: RepositorioMateria

    @Autowired
    lateinit var logService: LogService

    @Autowired
    lateinit var repoUsuario:RepositorioUsuario

    fun getProfesor(id:Long):Profesor  {

        val profesor = this.repositorioProfesor.findById(id).orElseThrow { NotFoundException("No se ha encontrado el profesor con id ${id}") }

        return profesor
    }

    fun getProfesores(): MutableList<Profesor> {
        return this.repositorioProfesor.findAll()
    }

    @Transactional
    fun crearProfesor(idUser:Long, profesor: Profesor) {

        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

        println(profesor.id)

        if(profesor.id < 0){
            val profesorPers = this.repositorioProfesor.save(profesor)
            val log = CreacionDeProfesor(userDTO,LocalDateTime.now().toString(),profesorPers)
            this.logService.createLog(log)
        }else{
            val profesorPers = this.repositorioProfesor.findById(profesor.id).get()

            val log = EdicionDeProfesor(userDTO,LocalDateTime.now().toString(),profesorPers,profesor)
            this.logService.createLog(log)

            this.repositorioProfesor.save(profesor)
        }

    }

    @Transactional
    fun borrarProfesor(idUser:Long, id: Long) {

        val profesor = repositorioProfesor.findById(id).orElseThrow { NotFoundException("No se ha encontrado el profesor con Id: ${id}") }

        val materiasConElProfesor = repositorioMateria.findMateriaByProfesoresContains(profesor)

        if (materiasConElProfesor.isEmpty()){
            this.repositorioProfesor.deleteById(id)

            val user = this.repoUsuario.findById(idUser).get()
            val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

            val log = BorradoDeProfesor(userDTO,LocalDateTime.now().toString(),profesor)
            this.logService.createLog(log)
        }else{
            throw BusinessException("No se puede borrar un profesor con materias asignadas")
        }
    }

}