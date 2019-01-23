package com.example.aloyise_apple.kotlinapp.utils

import android.app.Activity
import android.content.Intent
import android.view.View

/**
Created by Aloyise 2019/1/18
Description:
 */
inline fun <reified T: Activity> Activity.newIntent() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}