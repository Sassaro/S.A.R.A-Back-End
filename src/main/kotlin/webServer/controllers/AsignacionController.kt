package webServer.controllers

import domain.Asignacion
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import webServer.dto.AsignacionDTO
import webServer.dto.AulaInfoDTO
import webServer.dto.CreacionAsignacionDTO
import webServer.dto.EditAsignacionDTO
import webServer.services.AsignacionService

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/asignacion")
class AsignacionController(){

    @Autowired
    lateinit var asignacionService:AsignacionService

    @GetMapping
    fun getAsignaciones(): MutableList<Asignacion> {
        return asignacionService.getAsignaciones()
    }

    @GetMapping("/{id}")
    fun getAsignacion(@PathVariable id:Long): Asignacion? {
        return asignacionService.getAsignacionPorId(id)
    }

    @GetMapping("/cursando/{idEdificio}")
    fun getAsignacionesActualmenteCursando(@PathVariable idEdificio:Long): List<AulaInfoDTO> {
        return asignacionService.getAsignacionesActualmenteCursando(idEdificio)
    }

    @GetMapping("/aula/{id}")
    fun getAsignacionesPorAula(@PathVariable id:Long): List<AsignacionDTO> {
        return asignacionService.getAsignacionesDeAula(id)
    }

    @DeleteMapping("/eliminar/{id}/{idUser}")
    fun deleteAsignaciones(@PathVariable idUser:Long, @PathVariable id:Long) {
        return asignacionService.eliminarAsignacion(idUser,id)
    }

    @PatchMapping("/actualizar/{idUser}")
    fun updateAsignaciones(@PathVariable idUser:Long, @RequestBody events:List<EditAsignacionDTO>){
        return asignacionService.updateAsignaciones(idUser,events)
    }

    @PostMapping("/crear/{idUser}")
    fun createAsignacion(@PathVariable idUser:Long, @RequestBody asignacion: CreacionAsignacionDTO) {
        return asignacionService.crearAsignacion(idUser, asignacion)
    }

    @DeleteMapping("/deleteAll/{idUser}")
    fun deleteAll(@PathVariable idUser: Long){
        this.asignacionService.deleteAll(idUser)
    }
}