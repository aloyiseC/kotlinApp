package com.example.aloyise_apple.kotlinapp.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.example.aloyise_apple.kotlinapp.bean.Player
import io.reactivex.Flowable

/**
Created by Aloyise 2019/1/21
Description:
 */
@Dao
interface PlayerDao {

    @Query("SELECT * FROM player")
    fun getAllPlayers(): Flowable<List<Player>>

    @Insert(onConflict = REPLACE)
    fun insert(player: Player)
}