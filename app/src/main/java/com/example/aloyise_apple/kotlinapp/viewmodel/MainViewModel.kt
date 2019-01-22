package com.example.aloyise_apple.kotlinapp.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.aloyise_apple.kotlinapp.bean.Player
import com.example.aloyise_apple.kotlinapp.database.repository.PlayerRepository
import com.example.aloyise_apple.kotlinapp.viewmodel.listener.PlayerListener

/**
Created by Aloyise 2019/1/22
Description:
 */
class MainViewModel():ViewModel(){

    private var players = MutableLiveData<List<Player>>()
    var playerRepository:PlayerRepository ?= null

    constructor(playerRepository: PlayerRepository) : this() {
        this.playerRepository = playerRepository
    }

    fun getAllPlayers(){
        playerRepository?.findAllPlayers(object : PlayerListener{
            override fun onGetAllPlayers(list: List<Player>) {
                players.value = list
            }
        })
    }

    fun players():LiveData<List<Player>>{
        return players
    }
}