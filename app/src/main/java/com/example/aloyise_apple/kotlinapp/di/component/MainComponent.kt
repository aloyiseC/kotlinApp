package com.example.aloyise_apple.kotlinapp.di.component

import com.example.aloyise_apple.kotlinapp.MainActivity
import com.example.aloyise_apple.kotlinapp.di.module.MainModule
import com.example.aloyise_apple.kotlinapp.di.scope.ActivityScope
import dagger.Subcomponent

/**
Created by Aloyise 2019/1/22
Description:
 */
@Subcomponent(modules = arrayOf(MainModule::class))
@ActivityScope
interface MainComponent {
    fun inject(act:MainActivity)
}