package webServer.dto

import domain.Profesor
import java.time.LocalTime

data class CreacionAsignacionDTO(
    val idMateria:Long,
    val idAula: Long,
    val horaInicio:LocalTime,
    val horaFin:LocalTime,
    val dia:Int,

)