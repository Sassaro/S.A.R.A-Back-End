package webServer.controllers

import domain.logs.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import webServer.services.EdificioService
import webServer.services.LogService

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/logs")
class LogController{

    @Autowired
    lateinit var logService: LogService

    @GetMapping("/getAll")
    fun getLogs(): MutableList<Any> {
        return this.logService.getLogs()
    }

}