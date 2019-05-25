package irof.application.repository

import irof.domain.model.AnoIdentifier
import irof.domain.model.AnoModel

/**
 * あのリポジトリ
 */
interface AnoRepository {

    fun get(anoIdentifier: AnoIdentifier): AnoModel
}