package domain.logs

import jakarta.persistence.*
import nonapi.io.github.classgraph.json.Id
import org.springframework.data.mongodb.core.mapping.Document
import webServer.dto.LoginDTO
import java.time.LocalDateTime
import java.time.LocalTime

@Document(collection = "Log")
abstract class Log (
    val usuario: LoginDTO,
    val fechaDeCambio: String,
    val tipo:String
){
    @Id
    lateinit var id:String
}