package domain.logs

import domain.Profesor
import webServer.dto.LoginDTO

class EdicionDeProfesor(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val datosAnteriores:Profesor,
    val nuevosDatos: Profesor,
    tipo: String = "EDICION_PROFESOR"
):Log(usuario, fechaDeCambio, tipo){

}