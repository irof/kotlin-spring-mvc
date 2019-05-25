package irof.application.service

import irof.application.repository.AnoRepository
import irof.domain.model.AnoIdentifier
import irof.domain.model.AnoModel
import org.springframework.stereotype.Service

/**
 * あのサービス
 */
@Service
class AnoService(private val repository: AnoRepository) {

    /**
     * あれ取って
     */
    fun get(identifier: AnoIdentifier): AnoModel {
        return repository.get(identifier)
    }
}