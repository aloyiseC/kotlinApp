package com.example.aloyise_apple.kotlinapp.bean

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
Created by Aloyise 2019/1/21
Description:
 */
@Entity
class Player {

    @PrimaryKey(autoGenerate = true)
    var pid:Int = 0
    var name:String ?= null
    var position:String  ?= null
    var goal:Int = 0
    var assist:Int = 0
    @ColumnInfo(name = "match_num")
    var matchNum:Int = 0

}