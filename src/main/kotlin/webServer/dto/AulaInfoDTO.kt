package webServer.dto

import java.time.LocalTime

data class AulaInfoDTO(
    val idAula:Long,
    val nombreAula:String,
    val materia:String,
    val nombreProfesor:List<String>,
    val horaInicio:LocalTime,
    val horaFin:LocalTime,
    val habilitada:Boolean
)

data class AulaInfoRequest(
    val idAula: Long,
    val dia:Int,
    val hora:LocalTime
)