package domain

import jakarta.persistence.*
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import java.time.LocalTime

@Entity
class Aula(
    var nombre:String = "",
    val piso:Int,
    var nombreSVG:String = "",
    @Column(length = 1000)
    val geometria:String = "",
    @ManyToOne
    val edificio:Edificio,
    val habilitada:Boolean = true
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

}

enum class Piso(val value:Int){
    PLANTA_BAJA(0),
    SUB_SUELO(-1),
    PRIMER_PISO(1),
    SEGUNDO_PISO(2)
}