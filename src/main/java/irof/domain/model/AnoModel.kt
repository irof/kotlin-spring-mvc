package irof.domain.model

import irof.domain.type.AnoType

/**
 * あのモデル
 */
class AnoModel(private val anoIdentifier: AnoIdentifier, anoType: AnoType) {

    fun identifier(): AnoIdentifier {
        return anoIdentifier
    }

    fun category() : AnoEnum {
        return AnoEnum.ARE
    }
}