package domain.logs

import domain.Materia
import webServer.dto.LoginDTO

class EdicionDeMateria(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val datosViejos: Materia,
    val datosNuevos: Materia,
    tipo: String = "EDICION_MATERIA"
): Log(usuario, fechaDeCambio, tipo){

}