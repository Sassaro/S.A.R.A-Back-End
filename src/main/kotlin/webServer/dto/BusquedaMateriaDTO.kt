package webServer.dto

import domain.Piso
import java.time.LocalTime

data class BusquedaMateriaDTO(
    val idAula:Long,
    val idAsignaciom:Long,
    val posicionEdificioX:Double,
    val posicionEdificioY:Double,
    val nombreEdificio:String,
    val nombreAula:String,
    val piso:Int,
    val horaDesde: LocalTime,
    val horaHasta: LocalTime
)