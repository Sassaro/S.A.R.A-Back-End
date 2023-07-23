package domain

import jakarta.persistence.*

@Entity
class Materia(
   var nombre:String,
   @ManyToMany(fetch = FetchType.EAGER)
   var profesores:MutableList<Profesor>
) {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   var id: Long = 0

   fun agregarProfesor(profesor: Profesor){
      this.profesores.add(profesor)
   }

   fun quitarProfesor(profesor: Profesor){
      this.profesores.remove(profesor)
   }

}