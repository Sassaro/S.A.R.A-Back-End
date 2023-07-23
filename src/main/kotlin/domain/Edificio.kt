package domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType

@Entity
class Edificio(
    var nombre:String = "",
    var coordenadasX:Double = 0.0,
    var coordenadasY:Double = 0.0,
    //esta variable guarda el nombre del componente svg en el front.
    var nombreSVG :String = "",
    var imagen:String = ""
    ){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

//    fun agregarAula(aula: Aula){
//        this.aulas.add(aula)
//    }
//
//    fun quitarAula(aula: Aula){
//        this.aulas.remove(aula)
//    }
}
