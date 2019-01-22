package com.example.aloyise_apple.kotlinapp.di.module

import com.example.aloyise_apple.kotlinapp.database.repository.PlayerRepository
import com.example.aloyise_apple.kotlinapp.di.scope.ActivityScope
import com.example.aloyise_apple.kotlinapp.viewmodel.factory.MainViewModelFactory
import dagger.Module
import dagger.Provides

/**
Created by Aloyise 2019/1/22
Description:
 */
@Module
class MainModule {
    @Provides
    @ActivityScope
    fun provedeMainViewModelFactory(playerRepository: PlayerRepository):MainViewModelFactory{
        return MainViewModelFactory(playerRepository)
    }
}