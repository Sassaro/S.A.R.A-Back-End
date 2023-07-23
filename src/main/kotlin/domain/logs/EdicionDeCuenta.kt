package domain.logs

import webServer.dto.LoginDTO

class EdicionDeCuenta (
    usuario: LoginDTO,
    fechaDeCambio: String,
    val usuarioViejo: LoginDTO,
    val nuevoUsuario: LoginDTO,
    tipo: String = "EDICION_CUENTA"
) : Log(usuario, fechaDeCambio, tipo){

}