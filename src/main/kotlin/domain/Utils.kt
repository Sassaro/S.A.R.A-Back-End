package domain

import webServer.dto.EditAsignacionDTO
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId

fun getLocalDateInCountry(countryCode: String): LocalDate {
    val zoneId = ZoneId.of(countryCode)
    return LocalDate.now(zoneId)
}

fun getLocalTimeInCountry(countryCode: String): LocalTime {
    val zoneId = ZoneId.of(countryCode)
    return LocalTime.now(zoneId)
}

fun validarListaDeAsignaciones(asignaciones:List<EditAsignacionDTO>):Boolean{

    for (i in 0 until asignaciones.size - 1) {
        val currentEvent = asignaciones[i]
        for (j in i + 1 until asignaciones.size) {
            val nextEvent = asignaciones[j]

            if (currentEvent.dia == nextEvent.dia) {
                val currentStart = currentEvent.horaInicio
                val currentEnd = currentEvent.horaFin
                val nextStart = nextEvent.horaInicio
                val nextEnd = nextEvent.horaFin

                if ((currentStart <= nextStart && nextEnd < currentEnd) ||
                    (currentStart < nextEnd && nextEnd <= currentEnd) ||
                    (nextStart <= currentStart && currentStart < nextEnd) ||
                    (nextStart < currentEnd && currentEnd <= nextEnd)) {
                    return true
                }
            }
        }
    }
    return false
}

fun validacionDeAsignacion(asignacionAValidar: Asignacion,listaAsignacion:MutableList<Asignacion>,): Boolean {
    return listaAsignacion.any{ asignacion -> haySolapamiento(asignacion,asignacionAValidar) }
}

fun haySolapamiento(asignacion: Asignacion, asignacionAValidar: Asignacion):Boolean{

    return (asignacion.horaInicio == asignacionAValidar.horaInicio ||            //compara si estan completamente solapadas
            asignacion.horaFin == asignacionAValidar.horaFin ||
            asignacion.horaInicio.isBefore(asignacionAValidar.horaInicio) && asignacion.horaFin.isAfter(asignacionAValidar.horaFin) ||
            asignacion.horaInicio.isAfter(asignacionAValidar.horaInicio) && asignacion.horaFin.isBefore(asignacionAValidar.horaFin) ||
            estanParcialmenteSolapadas(asignacion,asignacionAValidar))&& asignacion.dia == asignacionAValidar.dia && asignacion.aula == asignacionAValidar.aula
}

fun estanParcialmenteSolapadas(asignacion: Asignacion, asignacionAValidar: Asignacion):Boolean{

    return estaEnMedio(asignacion.horaInicio,asignacion.horaFin,asignacionAValidar.horaInicio) ||
            estaEnMedio(asignacion.horaInicio,asignacion.horaFin,asignacionAValidar.horaFin)
}

fun estaEnMedio(inicio: LocalTime, fin: LocalTime, valor: LocalTime):Boolean{

    return valor.isAfter(inicio) && valor.isBefore(fin)
}

val HORAS_INICIO = listOf(LocalTime.parse("08:00"),LocalTime.parse("14:00"),LocalTime.parse("18:00"))
fun asignacionAutomatica(listaAulas:List<Aula>,listaMateria:List<Materia>): MutableList<Asignacion> {

    val listaAsignacion = mutableListOf<Asignacion>()
    var asignacion:Asignacion

    listaAulas.forEach { aula ->

        (1..5).forEach {dia ->
            do {
                val hora_inicio = HORAS_INICIO.random()
                var hora_fin:LocalTime = LocalTime.now()

                when(hora_inicio){
                    LocalTime.parse("08:00")-> hora_fin = LocalTime.parse("12:00")
                    LocalTime.parse("14:00")-> hora_fin = LocalTime.parse("18:00")
                    LocalTime.parse("18:00")-> hora_fin = LocalTime.parse("22:00")
                }

                asignacion = Asignacion(listaMateria.random(),aula,dia,hora_inicio,hora_fin)
            }while (validacionDeAsignacion(asignacion,listaAsignacion))

            listaAsignacion.add(asignacion)
        }
    }
    return listaAsignacion
}