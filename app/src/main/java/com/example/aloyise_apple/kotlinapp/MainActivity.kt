package com.example.aloyise_apple.kotlinapp

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.aloyise_apple.kotlinapp.bean.Player
import com.example.aloyise_apple.kotlinapp.di.module.MainModule
import com.example.aloyise_apple.kotlinapp.utils.newIntent
import com.example.aloyise_apple.kotlinapp.viewmodel.MainViewModel
import com.example.aloyise_apple.kotlinapp.viewmodel.factory.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var factory:MainViewModelFactory
    var viewModel: MainViewModel ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        KotlinAndroidApp.get(this).getAppComponent()?.sub(MainModule())?.inject(this)
        viewModel = ViewModelProviders.of(this,factory).get(MainViewModel::class.java)
        viewModel?.players()?.observe(this, Observer { this.refresh(it) });
        viewModel?.getAllPlayers()
        init()
    }

    fun refresh(list:List<Player>?){

    }

    fun init(){
        add_player_btn.setOnClickListener({
           newIntent<AddPlayerActivity>()
        })
    }
}
