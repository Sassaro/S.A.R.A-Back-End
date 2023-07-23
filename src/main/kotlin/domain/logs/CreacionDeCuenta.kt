package domain.logs

import webServer.dto.LoginDTO

class CreacionDeCuenta (
    usuario: LoginDTO,
    fechaDeCambio: String,
    val usuarioCreado: LoginDTO,
    tipo: String = "CREACION_CUENTA"
) : Log(usuario, fechaDeCambio, tipo){

}