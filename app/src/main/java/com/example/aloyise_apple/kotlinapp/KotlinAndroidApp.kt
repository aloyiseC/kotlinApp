package com.example.aloyise_apple.kotlinapp

import android.app.Application
import com.example.aloyise_apple.kotlinapp.di.component.AppComponent
import com.example.aloyise_apple.kotlinapp.di.component.DaggerAppComponent
import com.example.aloyise_apple.kotlinapp.di.module.AppModule

/**
Created by Aloyise 2019/1/14
Description:
 */
class KotlinAndroidApp:Application(){

    private lateinit var appComponent: AppComponent

    fun getAppComponent():AppComponent{
        if(appComponent == null)
            DaggerAppComponent.builder().appModule(AppModule(this)).build();
        return appComponent
    }
}