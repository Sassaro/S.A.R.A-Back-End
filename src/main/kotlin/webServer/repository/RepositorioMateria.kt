package webServer.repository

import domain.Materia
import domain.Profesor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import java.util.Optional

interface RepositorioMateria:JpaRepository<Materia,Long>{


    fun findMateriaByProfesoresContains(profesor:Profesor):List<Materia>

    fun findMateriaByNombre(nombre: String):Optional<Materia>

}