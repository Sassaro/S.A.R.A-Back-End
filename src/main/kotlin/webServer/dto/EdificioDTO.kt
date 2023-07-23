package webServer.dto

data class EdificioDTO(
    var id:Long = 0,
    var nombre:String = "",
    var coordenadasX:Double = 0.0,
    var coordenadasY:Double = 0.0,
    var nombreSVG: String,
    var imagen: String
)