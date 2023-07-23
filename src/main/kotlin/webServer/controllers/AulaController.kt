package webServer.controllers

import domain.Aula
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import webServer.dto.AulaDto
import webServer.dto.AulaInfoDTO
import webServer.dto.EditAulaDTO
import webServer.services.AulaService

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/aula")
class AulaController {

    @Autowired
    lateinit var aulaService:AulaService

    @GetMapping
    fun getAulas(): MutableIterable<Aula> {
        return this.aulaService.getAulas()
    }

    @GetMapping("/edificio/{id}/{piso}")
    fun getAulasEnEdificioYPiso(@PathVariable id:Long, @PathVariable piso:Int): List<Aula> {
        return this.aulaService.getAulasEnEdificioYPiso(id,piso)
    }

    @GetMapping("/{id}")
    fun getAula(@PathVariable id:Long): AulaDto? {
        return this.aulaService.getAulaById(id)
    }

    @GetMapping("/info/{idAula}")
    fun getAulaInfo(@PathVariable idAula: Long): AulaInfoDTO {
        return this.aulaService.getAulaInfo(idAula)
    }

    @PatchMapping("/cambiarEstado/{id}/{status}/{idUser}")
    fun updateHabilitacion(@PathVariable idUser:Long, @PathVariable id: Long, @PathVariable status: Boolean) {
        aulaService.updateHabilitacion(idUser, id, status)
    }

    @PatchMapping("/update/{idUser}")
    fun updateAula(@PathVariable idUser:Long, @RequestBody editAulaDTO:EditAulaDTO){
        aulaService.updateAula(idUser, editAulaDTO)
    }

}