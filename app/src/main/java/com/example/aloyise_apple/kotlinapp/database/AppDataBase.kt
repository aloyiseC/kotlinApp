package com.example.aloyise_apple.kotlinapp.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.aloyise_apple.kotlinapp.bean.Player
import com.example.aloyise_apple.kotlinapp.database.dao.PlayerDao

/**
Created by Aloyise 2019/1/21
Description:
 */
@Database(entities = arrayOf(Player::class),version = 1)
abstract class AppDataBase :RoomDatabase(){
    abstract fun playerDao():PlayerDao
}