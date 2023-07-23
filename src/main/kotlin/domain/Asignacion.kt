package domain

import jakarta.persistence.*
import java.time.LocalTime

//esta clase esta para poder reutilizar las materias en distintas asignaciones
@Entity
class Asignacion(
    @ManyToOne(fetch = FetchType.EAGER)
    var materia: Materia,
    @ManyToOne(fetch = FetchType.EAGER)
    var aula:Aula,
    //el dia representa el indice dentro de la semana 1 seria lunes, 2 martes....
    var dia:Int,
    var horaInicio:LocalTime,
    var horaFin:LocalTime,
){

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
}