package domain.logs

import domain.Profesor
import webServer.dto.LoginDTO

class CreacionDeProfesor(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val profesor: Profesor,
    tipo: String = "CREACION_DE_PROFESOR"
) : Log(usuario, fechaDeCambio, tipo){

}