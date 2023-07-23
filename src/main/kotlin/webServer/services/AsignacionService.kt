package webServer.services

import ARGETINA_ZONE_ID
import BusinessException
import NotFoundException
import domain.*
import domain.logs.BorradoDeAsignacion
import domain.logs.BorradoGeneral
import domain.logs.CreacionAsignacion
import domain.logs.EdicionDeAsignacion
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.stereotype.Service
import webServer.dto.*
import webServer.repository.RepositorioAsignacion
import webServer.repository.RepositorioAula
import webServer.repository.RepositorioMateria
import webServer.repository.RepositorioUsuario
import java.time.LocalDateTime

@Service
class AsignacionService() {

    @Autowired
    lateinit var repositorioAsignacion:RepositorioAsignacion

    @Autowired
    lateinit var repositorioAula: RepositorioAula

    @Autowired
    lateinit var repositorioMateria: RepositorioMateria

    @Autowired
    lateinit var logService: LogService

    @Autowired
    lateinit var repoUsuario: RepositorioUsuario

    fun getAsignaciones(): MutableList<Asignacion> {
        return repositorioAsignacion.findAll()
    }

    fun getAsignacionPorId(id:Long): Asignacion? {
        return repositorioAsignacion.findById(id).orElseThrow { NotFoundException("No se ha encontrado la asignacion con id ${id}") }
    }

    fun getAsignacionesActualmenteCursando(idEdificio:Long): List<AulaInfoDTO> {

        //obtiene el dia y hora de hoy
        val dia = getLocalDateInCountry(ARGETINA_ZONE_ID).dayOfWeek.value
        val hora = getLocalTimeInCountry(ARGETINA_ZONE_ID)

        val asignaciones = this.repositorioAsignacion.findAsignacionByAula_Edificio_IdAndDia(idEdificio,dia)
        val asignacionesActuales = asignaciones.filter { hora.isAfter(it.horaInicio) && hora.isBefore(it.horaFin) }

        val listaDTO = asignacionesActuales.map { asignacion ->
            AulaInfoDTO(
                asignacion.aula.id,
                asignacion.aula.nombre,
                asignacion.materia.nombre,
                asignacion.materia.profesores.map { it.nombre + " " + it.apellido },
                asignacion.horaInicio,
                asignacion.horaFin,
                asignacion.aula.habilitada
        ) }

        return listaDTO
    }

    fun getAsignacionesDeAula(id:Long): List<AsignacionDTO> {
        val asignaciones =  this.repositorioAsignacion.findAsignacionByAula_Id(id)

        return asignaciones.map { it-> AsignacionDTO(it.id,it.materia.nombre, it.horaInicio, it.horaFin, it.dia, it.materia.profesores) }
    }

    @Transactional(Transactional.TxType.REQUIRED)
    fun eliminarAsignacion(idUser: Long, id: Long) {
        try {
            repositorioAsignacion.deleteById(id)
        } catch (ex: EmptyResultDataAccessException) {
            throw NotFoundException("No se ha encontrado la asignación con ID $id")
        }

        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

        val log = BorradoDeAsignacion(userDTO,LocalDateTime.now().toString(),id)
        logService.createLog(log)
    }

    @Transactional
    fun updateAsignaciones(idUser:Long,events:List<EditAsignacionDTO>){

        if(validarListaDeAsignaciones(events)){
            throw BusinessException("No se pueden asignar materias con solapamiento")
        }

        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

        events.forEach { asignacion->
            val asignacionPers = this.repositorioAsignacion.findById(asignacion.id).get()

            //si hay algun cambio crea el log y guarda los datos
            if(asignacionPers.horaFin != asignacion.horaFin || asignacionPers.horaInicio != asignacion.horaInicio || asignacionPers.dia != asignacion.dia){

                val log = EdicionDeAsignacion(userDTO, LocalDateTime.now().toString(),
                    asignacion.id,asignacionPers.horaInicio.toString(),asignacionPers.horaFin.toString(),asignacion.horaInicio.toString(),
                    asignacion.horaFin.toString(),asignacionPers.dia,asignacion.dia)

                logService.createLog(log)

                asignacionPers.horaFin = asignacion.horaFin
                asignacionPers.horaInicio = asignacion.horaInicio
                asignacionPers.dia = asignacion.dia
                repositorioAsignacion.save(asignacionPers)

            }
        }
    }
    @Transactional
    fun crearAsignacion(idUser: Long, asignacionACrear: CreacionAsignacionDTO) {

        val materia = repositorioMateria.findById(asignacionACrear.idMateria).orElseThrow { NotFoundException("No se ha encontrado la materia con id: ${asignacionACrear.idMateria}") }
        val aula = repositorioAula.findById(asignacionACrear.idAula).orElseThrow { NotFoundException("No se ha encontrado el aula con id: ${asignacionACrear.idAula}") }

        val asignacion = Asignacion(materia,aula,asignacionACrear.dia,asignacionACrear.horaInicio,asignacionACrear.horaFin)
        val asignacionesDelAula = repositorioAsignacion.findAsignacionByAula_Id(asignacionACrear.idAula).toMutableList()

        if(validacionDeAsignacion(asignacion,asignacionesDelAula)){
            throw BusinessException("No se puede crear una asignacion que solape con las demas Asignaciones.")
        }else{

            val user = this.repoUsuario.findById(idUser).get()
            val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

            val id = repositorioAsignacion.save(asignacion).id

            val log = CreacionAsignacion(userDTO,LocalDateTime.now().toString(),id,asignacionACrear.horaInicio.toString(),
                asignacionACrear.horaFin.toString(),asignacionACrear.dia)

            logService.createLog(log)
        }
    }

    fun deleteAll(idUser: Long) {
        this.repositorioAsignacion.deleteAll()

        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)

        val log = BorradoGeneral(userDTO,LocalDateTime.now().toString())

        logService.createLog(log)

    }

}