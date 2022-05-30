package com.example.playingnumbers.domain.usecases

import com.example.playingnumbers.domain.entity.GameSettings
import com.example.playingnumbers.domain.entity.Level
import com.example.playingnumbers.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings{
        return repository.getGameSettings(level)
    }
}