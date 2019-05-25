package irof.infrastructure.mock

import irof.application.repository.AnoRepository
import irof.domain.model.AnoIdentifier
import irof.domain.model.AnoModel
import irof.domain.type.AnoType
import org.springframework.stereotype.Repository

@Repository
open class AnoRepositoryMock : AnoRepository {

    override fun get(anoIdentifier: AnoIdentifier): AnoModel {
        return AnoModel(anoIdentifier, AnoType())
    }
}