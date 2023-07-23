package domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Profesor(
    var nombre:String = "",
    var apellido:String = "",
    var dni:String = "",
){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
}