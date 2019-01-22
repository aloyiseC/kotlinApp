package com.example.aloyise_apple.kotlinapp.viewmodel.factory

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.aloyise_apple.kotlinapp.database.repository.PlayerRepository
import com.example.aloyise_apple.kotlinapp.viewmodel.MainViewModel

/**
Created by Aloyise 2019/1/22
Description:
 */
class MainViewModelFactory:ViewModelProvider.Factory {

    val playerRepository:PlayerRepository

    constructor(playerRepository: PlayerRepository) {
        this.playerRepository = playerRepository
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(playerRepository) as T
    }
}