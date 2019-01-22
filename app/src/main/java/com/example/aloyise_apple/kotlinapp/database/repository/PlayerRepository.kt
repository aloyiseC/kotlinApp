package com.example.aloyise_apple.kotlinapp.database.repository

import com.example.aloyise_apple.kotlinapp.database.AppDataBase
import com.example.aloyise_apple.kotlinapp.database.dao.PlayerDao
import com.example.aloyise_apple.kotlinapp.viewmodel.listener.PlayerListener
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
Created by Aloyise 2019/1/21
Description:
 */
class PlayerRepository {

    val playerDao:PlayerDao

    constructor(appDataBase: AppDataBase) {
        this.playerDao = appDataBase.playerDao()

    }

    fun findAllPlayers(playerListener:PlayerListener){
        playerDao.getAllPlayers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                      playerListener.onGetAllPlayers(it)
                })
    }
}