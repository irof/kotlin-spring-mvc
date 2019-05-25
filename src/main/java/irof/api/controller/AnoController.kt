package irof.api.controller

import irof.application.service.AnoService
import irof.domain.model.AnoIdentifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AnoController(private val service: AnoService) {

    @GetMapping("{identifier}")
    fun get(@PathVariable("identifier") identifier: AnoIdentifier): AnoData {
        val anoModel = service.get(identifier)
        return AnoData(anoModel.identifier().toString())
    }
}