package webServer.controllers

import domain.Edificio
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import webServer.dto.EdificioDTO
import webServer.services.EdificioService

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/edificios")
class EdificioController{

    @Autowired
    lateinit var edificioService:EdificioService

    @GetMapping
    fun getEdificios(): List<EdificioDTO> {
        return this.edificioService.getEdificios()
    }

    @GetMapping("/{id}")
    fun getEdificio(@PathVariable id:Long): EdificioDTO? {
        return this.edificioService.getEdificioPorId(id)
    }

    @GetMapping("/mapa/{id}")
    fun getMapaDelEdificio(@PathVariable id:Long): String {
        return this.edificioService.getMapaEdificioPorId(id)
    }

}
