package com.example.unscramble.ui

import kotlinx.coroutines.flow.MutableStateFlow

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0
)
private val _uiState = MutableStateFlow(GameUiState())
