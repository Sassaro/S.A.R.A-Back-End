package webServer.repository

import domain.Profesor
import org.springframework.data.jpa.repository.JpaRepository

interface RepositorioProfesor:JpaRepository<Profesor,Long> {
}