package com.example.playingnumbers.domain.repository

import com.example.playingnumbers.domain.entity.GameSettings
import com.example.playingnumbers.domain.entity.Level
import com.example.playingnumbers.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
