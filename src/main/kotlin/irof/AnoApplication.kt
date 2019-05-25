package irof

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class AnoApplication

fun main(args: Array<String>) {
    runApplication<AnoApplication>(*args)
}
