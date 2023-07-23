package webServer.services

import ARGETINA_ZONE_ID
import BusinessException
import NotFoundException
import domain.*
import domain.logs.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import webServer.dto.BusquedaMateriaDTO
import webServer.dto.LoginDTO
import webServer.repository.*
import java.time.LocalDateTime

@Service
class MateriaService() {

    @Autowired
    lateinit var repositorioMateria: RepositorioMateria

    @Autowired
    lateinit var repositorioAsignacion: RepositorioAsignacion

    @Autowired
    lateinit var logService: LogService

    @Autowired
    lateinit var repoUsuario: RepositorioUsuario

    fun getMaterias(): MutableIterable<Materia> {
        val sort = Sort.by(Sort.Order.asc("nombre"))
        return this.repositorioMateria.findAll(sort)
    }

    fun getNombreMaterias(): Set<String> {

        //obtiene el dia y hora de hoy
        val dia = getLocalDateInCountry(ARGETINA_ZONE_ID).dayOfWeek.value
        val hora = getLocalTimeInCountry(ARGETINA_ZONE_ID)

        val asignaciones = repositorioAsignacion.findAsignacionByDia(dia).filter { it ->
            it.horaInicio.isAfter(hora) || estaEnMedio(it.horaInicio,it.horaFin,hora) || it.horaInicio == hora
        }

        return asignaciones.map { it.materia.nombre }.toSet()
    }

    fun getMateriaPorId(id: Long): Materia? {
        return this.repositorioMateria.findById(id)
            .orElseThrow { NotFoundException("No se ha encontrado la materia con id ${id}") }
    }

    fun getMateriasDelDiaPorNombre(nombre: String): List<BusquedaMateriaDTO> {

        //obtiene el dia de hoy en Argentina/Buenos Aires
        val dia = getLocalDateInCountry(ARGETINA_ZONE_ID).dayOfWeek.value

        val asignaciones = this.repositorioAsignacion.findAsignacionByMateria_NombreAndDia(nombre, dia)

        val listaDeDTO =  asignaciones.map { asignacion ->
            BusquedaMateriaDTO(
                asignacion.aula.id,
                asignacion.id,
                asignacion.aula.edificio.coordenadasX,
                asignacion.aula.edificio.coordenadasY,
                asignacion.aula.edificio.nombre,
                asignacion.aula.nombre,
                asignacion.aula.piso,
                asignacion.horaInicio,
                asignacion.horaFin
            )
        }
        return listaDeDTO
    }
    @Transactional
    fun crearMateria(idUser: Long, materia: Materia) {

        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)
        val obsMateria  = this.repositorioMateria.findMateriaByNombre(materia.nombre)

        if(obsMateria.isPresent && materia.id != obsMateria.get().id){
            throw BusinessException("Ya existe una materia con el nombre: ${materia.nombre}")
        }else{

            if(materia.id < 0){

                val materiaPers = repositorioMateria.save(materia)

                val log = CreacionMateria(userDTO, LocalDateTime.now().toString(),materiaPers)
                this.logService.createLog(log)

            }else{
                val materiaPers = this.repositorioMateria.findById(materia.id).get()

                val log = EdicionDeMateria(userDTO,LocalDateTime.now().toString(),materiaPers,materia)
                this.logService.createLog(log)

                this.repositorioMateria.save(materia)
            }
        }
    }

    @Transactional
    fun borrarMateria(idUser: Long,idMateria: Long){

        val user = this.repoUsuario.findById(idUser).get()
        val userDTO = LoginDTO(user.id,user.nombreUsuario,user.rol.name)
        val materia = this.repositorioMateria.findById(idMateria).orElseThrow { NotFoundException("No se ha encontrado la materia con Id: $idMateria") }
        val asignaciones = this.repositorioAsignacion.findAsignacionByMateria_Id(idMateria)

        //borra todas las asignaciones de la materia.
        asignaciones.forEach { this.repositorioAsignacion.deleteById(it.id) }

        //borra la materia
        this.repositorioMateria.delete(materia)

        val log = BorradoDeMateria(userDTO,LocalDateTime.now().toString(),materia)
        this.logService.createLog(log)

    }

}