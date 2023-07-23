package domain.logs

import webServer.dto.LoginDTO
import java.time.LocalDateTime
import java.time.LocalTime

class EdicionDeAsignacion(
    usuario: LoginDTO,
    fechaDeCambio: String,
    val idAsignacion: Long,
    val horaInicioOriginal:String,
    val horaFinOriginal: String,
    val nuevaHoraInicio:String,
    val nuevaHoraFin:String,
    val diaOriginal:Int,
    val nuevoDia:Int,
    tipo: String = "EDICION_ASIGNACION"
) : Log(usuario, fechaDeCambio, tipo)