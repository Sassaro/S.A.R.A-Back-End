package webServer.controllers

import domain.Materia
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import webServer.dto.BusquedaMateriaDTO
import webServer.services.MateriaService

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/materia")
class MateriaController{

    @Autowired
    lateinit var materiasService: MateriaService

    @GetMapping
    fun getMaterias(): MutableIterable<Materia> {
        return materiasService.getMaterias()
    }

    @GetMapping("/nombre")
    fun getNombreMaterias(): Set<String> {
        return materiasService.getNombreMaterias()
    }

    @GetMapping("/{id}")
    fun getMateria(@PathVariable id:Long): Materia? {
        return materiasService.getMateriaPorId(id)
    }

    @GetMapping("/filtro/{nombreMateria}")
        fun getMateriasDelDiaPorNombre(@PathVariable nombreMateria:String): List<BusquedaMateriaDTO> {
        return materiasService.getMateriasDelDiaPorNombre(nombreMateria)
    }

    @PostMapping("/crear/{idUser}")
    fun crearMateria(@PathVariable idUser:Long, @RequestBody materia: Materia) {
        materiasService.crearMateria(idUser,materia)
    }

    @DeleteMapping("/borrar/{idUser}/{idMateria}")
    fun borrarMateria(@PathVariable idUser:Long, @PathVariable idMateria: Long) {
        materiasService.borrarMateria(idUser,idMateria)
    }

}