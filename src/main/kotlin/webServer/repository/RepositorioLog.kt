package webServer.repository

import domain.logs.Log
import org.springframework.data.mongodb.repository.MongoRepository

interface RepositorioLog : MongoRepository <Log,String> {

}