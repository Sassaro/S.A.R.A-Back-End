package webServer.services

import ARGETINA_ZONE_ID
import NotFoundException
import domain.Aula
import domain.estaEnMedio
import domain.getLocalDateInCountry
import domain.getLocalTimeInCountry
import domain.logs.ClausuraDeAula
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import webServer.dto.*
import webServer.repository.RepositorioAsignacion
import webServer.repository.RepositorioAula
import webServer.repository.RepositorioUsuario
import java.time.LocalDateTime
import java.time.LocalTime

@Service
class AulaService() {

    @Autowired
    lateinit var repositorioAula: RepositorioAula

    @Autowired
    lateinit var logService: LogService

    @Autowired
    lateinit var repoUsuario: RepositorioUsuario

    @Autowired
    lateinit var repositorioAsignacion: RepositorioAsignacion

    fun getAulas(): MutableIterable<Aula> {
        return this.repositorioAula.findAll()
    }

    fun getAulasEnEdificioYPiso(id:Long, piso:Int): List<Aula> {
        return this.repositorioAula.findAulaByEdificio_IdAndPiso(id,piso)
    }

    fun getAulaById(id: Long): AulaDto {
        val aula =  this.repositorioAula.findById(id).orElseThrow { NotFoundException("No se ha encontrado el aula con id ${id}") }
        val aulaDTO = AulaDto(aula.id,aula.nombre,aula.nombreSVG,aula.piso,aula.edificio.nombre,aula.habilitada)
        //obtiene el dia y hora de hoy
        val dia = getLocalDateInCountry(ARGETINA_ZONE_ID).dayOfWeek.value
        val hora = getLocalTimeInCountry(ARGETINA_ZONE_ID)
        val materiasAula = this.repositorioAsignacion.findAsignacionByAula_IdAndDiaOrderByHoraInicio(id,dia)
        val asignacionActual = materiasAula.find { hora.isAfter(it.horaInicio) && hora.isBefore(it.horaFin) }

        if(asignacionActual != null){
            val asigActualDTO = AsignacionDTO(asignacionActual.id,asignacionActual.materia.nombre, asignacionActual.horaInicio, asignacionActual.horaFin, asignacionActual.dia, asignacionActual.materia.profesores)
            aulaDTO.materiaActual = asigActualDTO

            val indice = materiasAula.indexOf(asignacionActual)

            if(materiasAula.size > indice + 1){
                val asignacionSiguiente = materiasAula[indice + 1]
                aulaDTO.materiaSiguiente = AsignacionDTO(asignacionSiguiente.id,asignacionSiguiente.materia.nombre, asignacionSiguiente.horaInicio, asignacionSiguiente.horaFin, asignacionSiguiente.dia, asignacionSiguiente.materia.profesores)
            }

        }else{
            val asignacionSiguiente = materiasAula.find { hora.isBefore(it.horaFin) }
            if(asignacionSiguiente != null){
                aulaDTO.materiaSiguiente = AsignacionDTO(asignacionSiguiente.id,asignacionSiguiente.materia.nombre, asignacionSiguiente.horaInicio, asignacionSiguiente.horaFin, asignacionSiguiente.dia, asignacionSiguiente.materia.profesores)
            }
        }

        return aulaDTO

    }

    fun getAulaInfo(idAula:Long): AulaInfoDTO {

        //obtiene el dia y hora de hoy
        val dia = getLocalDateInCountry(ARGETINA_ZONE_ID).dayOfWeek.value
        val hora = getLocalTimeInCountry(ARGETINA_ZONE_ID)

        val aula = this.repositorioAula.findById(idAula)
            .orElseThrow { NotFoundException("No se ha encontrado el aula con id: ${idAula}") }

        val asignaciones = this.repositorioAsignacion.findAsignacionByAula_Id(aula.id)

        val asignacion = asignaciones.find { it.dia == dia && estaEnMedio(it.horaInicio,it.horaFin,hora) }
            ?: return AulaInfoDTO(aula.id,aula.nombre,"", listOf(), LocalTime.now(), LocalTime.now(), aula.habilitada)

        return AulaInfoDTO(
            aula.id,
            aula.nombre,
            asignacion.materia.nombre,
            asignacion.materia.profesores.map { it.nombre + " " + it.apellido },
            asignacion.horaInicio,
            asignacion.horaFin,
            aula.habilitada
        )
    }

    fun updateHabilitacion(idUser:Long, id: Long, estaHabilitada: Boolean) {

        val aula = this.repositorioAula.findById(id).orElseThrow { NotFoundException("No se ha encontrado el Aula con Id: $id") }

        if (!estaHabilitada){
            repositorioAula.removeAsignacion(id)
        }
        repositorioAula.setHabilitacion(id, estaHabilitada)

        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

        val log = ClausuraDeAula(userDTO, LocalDateTime.now().toString(),aula.nombre,aula.id,estaHabilitada)

        this.logService.createLog(log)

    }

    @Transactional
    fun updateAula(idUser: Long, editAulaDTO: EditAulaDTO) {

        var aulaPers = this.repositorioAula.findById(editAulaDTO.id).orElseThrow { NotFoundException("No se ha encontrado el Aula con Id: ${editAulaDTO.id}") }

        //lo dejo por aca falta crear el log
        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

        aulaPers.nombre = editAulaDTO.nombre
        aulaPers.nombreSVG = editAulaDTO.nombreSVG

        this.repositorioAula.save(aulaPers)

    }
}
