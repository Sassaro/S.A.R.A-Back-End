package webServer.repository

import domain.Asignacion
import org.springframework.data.jpa.repository.JpaRepository

interface RepositorioAsignacion:JpaRepository<Asignacion,Long>{

    fun findAsignacionByAula_Id(Aula_id:Long):List<Asignacion>

    fun findAsignacionByMateria_NombreAndDia(materia_nombre: String, dia: Int):List<Asignacion>

    fun findAsignacionByAula_Edificio_IdAndDia(aula_edificio_id: Long, dia: Int):List<Asignacion>

    fun findAsignacionByAula_IdAndDiaOrderByHoraInicio(aula_id: Long, dia: Int):List<Asignacion>

    fun findAsignacionByDia(dia: Int):List<Asignacion>

    fun findAsignacionByMateria_Id(materia_id: Long):List<Asignacion>

}