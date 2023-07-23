package domain.logs

import webServer.dto.LoginDTO

class BorradoCuenta (
    usuario: LoginDTO,
    fechaDeCambio: String,
    val usuarioBorrado: LoginDTO,
    tipo: String = "BORRADO_CUENTA"
) : Log(usuario, fechaDeCambio, tipo){

}