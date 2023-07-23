package webServer.repository

import domain.Roles
import domain.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface RepositorioUsuario:JpaRepository<Usuario,Long> {

    fun getAdministradorByContraseniaAndNombreUsuario(contrasenia: String, nombreUsuario: String):Optional<Usuario>

    fun getUsuarioByNombreUsuario(nombreUsuario: String): Optional<Usuario>

    fun countByRol(rol:Roles): Int


}