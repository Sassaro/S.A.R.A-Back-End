package webServer.services

import NotFoundException
import domain.Edificio
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import webServer.dto.EdificioDTO
import webServer.repository.RepositorioEdificio

@Service
class EdificioService(){

    @Autowired
    lateinit var repositorioEdificio: RepositorioEdificio

    fun getEdificios(): List<EdificioDTO> {

        val edificios = this.repositorioEdificio.findAll()

        return edificios.map { it -> this.mapToDTO(it) }

    }

    fun getEdificioPorId(id:Long): EdificioDTO {

        val edificio = this.repositorioEdificio.findById(id).orElseThrow { NotFoundException("No se ha encontrado el edificio con Id ${id}") }

        return mapToDTO(edificio)
    }

    fun getMapaEdificioPorId(id: Long): String {
        val edificio = this.repositorioEdificio.findById(id).orElseThrow { NotFoundException("No se ha encontrado el edificio con Id ${id}") }
        return edificio.nombreSVG
    }

    fun mapToDTO(edificio: Edificio): EdificioDTO {
        return EdificioDTO(edificio.id,edificio.nombre,edificio.coordenadasX,edificio.coordenadasY,edificio.nombreSVG,edificio.imagen)
    }

}
