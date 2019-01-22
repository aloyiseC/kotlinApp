package com.example.aloyise_apple.kotlinapp.viewmodel.listener

import com.example.aloyise_apple.kotlinapp.bean.Player

/**
Created by Aloyise 2019/1/21
Description:
 */
interface PlayerListener {
    fun onGetAllPlayers(list:List<Player>)
}