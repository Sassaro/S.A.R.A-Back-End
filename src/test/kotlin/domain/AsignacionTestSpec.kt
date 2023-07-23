package domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import listMateria
import listaAulas
import java.lang.RuntimeException
import java.time.LocalDate
import java.time.LocalTime

class AsignacionTestSpec:DescribeSpec({


    val profesorTest = Profesor("Juan","Perez","13513456")

//    val aula_01 = Aula()

    val materia_01 = Materia("Materia_01",mutableListOf(profesorTest))
    val materia_02 = Materia("Materia_02",mutableListOf(profesorTest))
    val materia_03 = Materia("Materia_03",mutableListOf(profesorTest))
    val materia_04 = Materia("Materia_04",mutableListOf(profesorTest))
    val materia_05 = Materia("Materia_05",mutableListOf(profesorTest))
    val materia_06 = Materia("Materia_06",mutableListOf(profesorTest))
    val materia_07 = Materia("Materia_07",mutableListOf(profesorTest))

//    val asignacion_01 = Asignacion(materia_01, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
//    val asignacion_02 = Asignacion(materia_02, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
//    val asignacion_03 = Asignacion(materia_03, LocalTime.parse("10:00"),LocalTime.parse("14:00"))
//    val asignacion_04 = Asignacion(materia_04, LocalTime.parse("16:00"),LocalTime.parse("20:00"))
//    val asignacion_05 = Asignacion(materia_05, LocalTime.parse("13:00"),LocalTime.parse("17:00"))
//    val asignacion_06 = Asignacion(materia_06, LocalTime.parse("10:00"),LocalTime.parse("20:00"))
//    val asignacion_07 = Asignacion(materia_07, LocalTime.parse("18:00"),LocalTime.parse("22:00"))


    describe("Test relacionados con la asignacion de materias en un aula"){
//
//        it("La materia se debe asignar de manera exitosa"){
//            aula_01.agregarAsignacion(0,asignacion_01)
//            aula_01.diasDeLaSemana[0].asignacionesDelDia.contains(asignacion_01).shouldBe(true)
//        }
//
//        it("La materia se debe desasignar de manera exitosa"){
//            aula_01.quitarAsignacion(0,asignacion_01)
//            aula_01.diasDeLaSemana[0].asignacionesDelDia.isEmpty().shouldBe(true)
//            aula_01.agregarAsignacion(0,asignacion_01)
//        }
//
//        it("Si el dia de la semana es muy alto, deberia tirar un error"){
//            shouldThrow<RuntimeException>{
//                aula_01.agregarAsignacion(7,asignacion_01)
//            }
//        }
//
//        it("Si el dia de la semana es muy bajo, deberia tirar un error"){
//            shouldThrow<RuntimeException>{
//                aula_01.agregarAsignacion(-1,asignacion_01)
//            }
//        }
//
//        it("Si la materia esta solapada, debe tirar error caso 1"){
//            shouldThrow<RuntimeException>{
//                aula_01.agregarAsignacion(0,asignacion_02)
//            }
//        }
//
//        it("Si la materia esta solapada, debe tirar error caso 2"){
//            shouldThrow<RuntimeException>{
//                aula_01.agregarAsignacion(0,asignacion_03)
//            }
//        }
//
//        it("Si la materia esta solapada, debe tirar error caso 3"){
//            shouldThrow<RuntimeException>{
//                aula_01.agregarAsignacion(0,asignacion_04)
//            }
//        }
//
//        it("Si la materia esta solapada, debe tirar error caso 4"){
//            shouldThrow<RuntimeException>{
//                aula_01.agregarAsignacion(0,asignacion_05)
//            }
//        }
//
//        it("Si la materia esta solapada, debe tirar error caso 5"){
//            shouldThrow<RuntimeException>{
//                aula_01.agregarAsignacion(0,asignacion_06)
//            }
//        }

        it("Si la materia esta solapada, debe tirar error caso 6"){

            asignacionAutomatica(listaAulas,listMateria)


        }
    }
})