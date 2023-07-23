package domain.logs

import webServer.dto.LoginDTO

class CreacionAsignacion(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val idAsignacion: Long,
    val horaInicio:String,
    val horaFin: String,
    val dia:Int,
    tipo: String = "CREACION_ASIGNACION"
) : Log(usuario, fechaDeCambio, tipo){

}