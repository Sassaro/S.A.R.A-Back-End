package domain.logs

import webServer.dto.LoginDTO

class BorradoDeAsignacion(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val idAsignacion: Long,
    tipo: String = "BORRADO_ASIGNACION"
):Log(usuario, fechaDeCambio, tipo){

}