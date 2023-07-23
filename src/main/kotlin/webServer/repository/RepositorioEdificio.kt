package webServer.repository

import domain.Edificio
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface RepositorioEdificio:JpaRepository<Edificio,Long>{

    fun getNombreSVGById(id: Long):String

}