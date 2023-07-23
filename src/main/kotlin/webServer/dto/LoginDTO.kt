package webServer.dto

import domain.Usuario

data class LoginDTO(
    val id:Long,
    val nombreUsuario: String,
    val rol:String
)