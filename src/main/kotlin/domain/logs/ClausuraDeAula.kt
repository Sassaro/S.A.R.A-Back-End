package domain.logs

import webServer.dto.LoginDTO

class ClausuraDeAula(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val nombreAula:String,
    val idAula:Long,
    val activo:Boolean,
    tipo: String = "CAMBIO_HABILITACION_AULA"
    ) : Log(usuario, fechaDeCambio, tipo)