package webServer.dto

import java.time.LocalTime

data class EdificioInfoRequestDTO(
    var idEdificio:Long,
    var dia:Int,
    var hora: LocalTime
)