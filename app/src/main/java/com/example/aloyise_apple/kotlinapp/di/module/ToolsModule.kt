package com.example.aloyise_apple.kotlinapp.di.module

import android.arch.persistence.room.Room
import android.content.Context
import com.example.aloyise_apple.kotlinapp.database.AppDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
Created by Aloyise 2019/1/21
Description: provide some instances of tools
 */
@Module
class ToolsModule {
    @Provides
    @Singleton
    fun provideAppDataBase(context: Context):AppDataBase{
        return Room.databaseBuilder(context,AppDataBase::class.java,"data_base")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
    }
}