package webServer

import admin
import asignador
import edificio_01
import listAsignacionAleatoria
import listMateria
import listaAulas
import listaProfesores
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import webServer.repository.*

@Service
class MateriasBootstrap : InitializingBean {

    @Autowired
    lateinit var repoMateria:RepositorioMateria
    @Autowired
    lateinit var repoAula: RepositorioAula
    @Autowired
    lateinit var repoEdificio: RepositorioEdificio
    @Autowired
    lateinit var repoProfesor: RepositorioProfesor
    @Autowired
    lateinit var repoUser: RepositorioUsuario
    @Autowired
    lateinit var repoAsignacion: RepositorioAsignacion
    @Autowired
    lateinit var repoLog:RepositorioLog

    override fun afterPropertiesSet() {
        println("************************************************************************")
        println("Running initialization")
        println("************************************************************************")
        init()
    }

    fun init(){

        repoLog.deleteAll()

        repoUser.save(admin)
        repoUser.save(asignador)

        listaProfesores.forEach{ prof -> repoProfesor.save(prof) }

        repoEdificio.save(edificio_01)

        listMateria.forEach{ materia -> repoMateria.save(materia) }
        listaAulas.forEach{ aula -> repoAula.save(aula)}
        listAsignacionAleatoria.forEach { asig -> repoAsignacion.save(asig) }

    }
}