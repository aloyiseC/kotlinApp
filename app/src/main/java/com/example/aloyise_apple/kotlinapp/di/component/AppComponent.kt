package com.example.aloyise_apple.kotlinapp.di.component

import com.example.aloyise_apple.kotlinapp.MainActivity
import com.example.aloyise_apple.kotlinapp.di.module.AppModule
import com.example.aloyise_apple.kotlinapp.di.module.MainModule
import com.example.aloyise_apple.kotlinapp.di.module.RepositoryModule
import com.example.aloyise_apple.kotlinapp.di.module.ToolsModule
import dagger.Component
import javax.inject.Singleton

/**
Created by Aloyise 2019/1/14
Description:
 */
@Singleton
@Component(modules=[AppModule::class,ToolsModule::class,RepositoryModule::class])
interface AppComponent {
    fun sub(module:MainModule):MainComponent
}