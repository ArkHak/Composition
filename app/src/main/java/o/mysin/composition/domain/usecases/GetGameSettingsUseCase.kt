package o.mysin.composition.domain.usecases

import o.mysin.composition.domain.entity.GameSettings
import o.mysin.composition.domain.entity.Level
import o.mysin.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository,
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
