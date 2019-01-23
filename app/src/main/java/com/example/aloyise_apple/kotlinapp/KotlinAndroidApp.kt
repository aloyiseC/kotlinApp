package com.example.aloyise_apple.kotlinapp

import android.app.Application
import android.content.Context
import com.example.aloyise_apple.kotlinapp.di.component.AppComponent
import com.example.aloyise_apple.kotlinapp.di.component.DaggerAppComponent
import com.example.aloyise_apple.kotlinapp.di.module.AppModule

/**
Created by Aloyise 2019/1/14
Description:
 */
class KotlinAndroidApp:Application(){

    private var appComponent: AppComponent?=null

    fun getAppComponent():AppComponent?{
        if(appComponent == null)
            appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build();
        return appComponent
    }



    companion object {
        operator fun get(context: Context):KotlinAndroidApp{
            return context.applicationContext as KotlinAndroidApp
        }
    }

}