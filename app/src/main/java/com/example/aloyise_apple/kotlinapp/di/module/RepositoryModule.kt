package com.example.aloyise_apple.kotlinapp.di.module

import com.example.aloyise_apple.kotlinapp.database.AppDataBase
import com.example.aloyise_apple.kotlinapp.database.repository.PlayerRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
Created by Aloyise 2019/1/22
Description: provide all the type of repository
 */
@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun providePlayerRepository(appDataBase: AppDataBase):PlayerRepository{
        return PlayerRepository(appDataBase)
    }
}