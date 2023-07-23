package webServer.dto

import domain.Edificio
import jakarta.persistence.Column
import jakarta.persistence.ManyToOne

class AulaDto(
    val id:Long,
    val nombre:String,
    val nombreSVG:String,
    val piso:Int,
    val nombreEdificio: String,
    val habilitada:Boolean){

    var materiaActual:AsignacionDTO? = null
    var materiaSiguiente:AsignacionDTO? = null
}