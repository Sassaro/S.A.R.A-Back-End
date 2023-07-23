package domain.logs

import domain.Materia
import webServer.dto.LoginDTO

class BorradoDeMateria(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val materia: Materia,
    tipo: String = "BORRADO_MATERIA"
):Log(usuario, fechaDeCambio, tipo){
}