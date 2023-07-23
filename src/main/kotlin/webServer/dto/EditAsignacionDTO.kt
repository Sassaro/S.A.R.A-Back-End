package webServer.dto

import java.time.LocalTime

data class EditAsignacionDTO(
    val id:Long,
    val horaInicio: LocalTime,
    val horaFin: LocalTime,
    val dia: Int
)