package webServer.dto

import domain.Profesor
import java.time.LocalTime

data class AsignacionDTO(
    val id:Long,
    val nombreMateria:String,
    val horaInicio:LocalTime,
    val horaFin:LocalTime,
    val dia:Int,
    val profesores:List<Profesor>
)