package webServer.services;

import domain.logs.Log
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webServer.repository.RepositorioLog

@Service
class LogService {

    @Autowired
    lateinit var repositorioLog:RepositorioLog

    fun createLog(log:Log){
        this.repositorioLog.save(log)
    }

    fun getLogs(): MutableList<Any> {
        return this.repositorioLog.findAll().toMutableList()
    }

}