package domain.logs

import domain.Profesor
import webServer.dto.LoginDTO

class BorradoDeProfesor(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val profesor: Profesor,
    tipo: String = "BORRADO_DE_PROFESOR"
) : Log(usuario, fechaDeCambio, tipo){

}