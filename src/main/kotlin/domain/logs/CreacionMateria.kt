package domain.logs

import domain.Materia
import webServer.dto.LoginDTO

class CreacionMateria(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val materia: Materia,
    tipo: String = "CREACION_MATERIA"
):Log(usuario, fechaDeCambio, tipo){

}