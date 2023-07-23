package domain

import jakarta.persistence.*

@Entity
class Usuario(
    var nombreUsuario:String = "",
    var contrasenia: String = "",
    @Enumerated(EnumType.STRING)
    var rol: Roles
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

}