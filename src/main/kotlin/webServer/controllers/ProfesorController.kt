package webServer.controllers

import domain.Profesor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import webServer.services.ProfesorService

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/profesor")
class ProfesorController {

    @Autowired
    lateinit var profesorService:ProfesorService

    @GetMapping("/{id}")
    fun getProfesor(@PathVariable id:Long): Profesor {
        return profesorService.getProfesor(id)
    }

    @GetMapping
    fun getProfesores(): MutableList<Profesor> {
        return profesorService.getProfesores()
    }

    @PostMapping("/crear/{idUser}")
    fun crearProfesor(@PathVariable idUser:Long, @RequestBody profesor:Profesor) {
        profesorService.crearProfesor(idUser, profesor)
    }

    @DeleteMapping("/borrar/{id}/{idUser}")
    fun borrarProfesor(@PathVariable idUser:Long, @PathVariable id:Long) {

        profesorService.borrarProfesor(idUser,id)
    }

}