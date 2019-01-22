package com.example.aloyise_apple.kotlinapp.di.module

import android.content.Context
import com.example.aloyise_apple.kotlinapp.KotlinAndroidApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
Created by Aloyise 2019/1/14
Description:
 */
@Module
class AppModule (context:KotlinAndroidApp){

    var context:Context

    init {
         this.context = context
    }

    @Provides
    @Singleton
    fun provideApplication():Context{
        return context
    }

}