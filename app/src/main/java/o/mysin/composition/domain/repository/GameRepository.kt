package o.mysin.composition.domain.repository

import o.mysin.composition.domain.entity.GameSettings
import o.mysin.composition.domain.entity.Level
import o.mysin.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int,
    ): Question

    fun getGameSettings(
        level: Level,
    ): GameSettings
}
