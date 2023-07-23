package webServer.repository

import domain.Aula
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util.*


interface RepositorioAula:JpaRepository<Aula,Long>{

    fun findAulaByEdificio_IdAndPiso(edificio_id: Long, piso:Int):List<Aula>
    @Transactional
    @Modifying
    @Query("UPDATE Aula a SET a.habilitada = :estaHabilitada WHERE a.id = :id")
    fun setHabilitacion(
        @Param("id") id: Long,
        @Param("estaHabilitada") estaHabilitada: Boolean
    ): Int
    @Transactional
    @Modifying
    @Query("DELETE FROM Asignacion a WHERE a.aula.id = :id")
    fun removeAsignacion(
        @Param("id") id: Long,
    ): Int
}