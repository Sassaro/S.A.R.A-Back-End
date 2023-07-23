package domain.logs

import webServer.dto.LoginDTO

class BorradoGeneral(
    usuario: LoginDTO,
    fechaDeCambio: String,
    tipo: String = "BORRADO_GENERAL"
) : Log(usuario, fechaDeCambio, tipo){

}