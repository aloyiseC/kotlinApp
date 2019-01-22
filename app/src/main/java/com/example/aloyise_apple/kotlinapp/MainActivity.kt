package com.example.aloyise_apple.kotlinapp

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.aloyise_apple.kotlinapp.bean.Player
import com.example.aloyise_apple.kotlinapp.viewmodel.MainViewModel
import com.example.aloyise_apple.kotlinapp.viewmodel.factory.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    internal var factory:MainViewModelFactory ?= null
    var viewModel: MainViewModel ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        KotlinAndroidApp.get(this).getAppComponent().sub(this).inject(this)
        viewModel = ViewModelProviders.of(this,factory).get(MainViewModel::class.java)
        viewModel?.players()?.observe(this, Observer { this.refresh(it) });
        viewModel?.getAllPlayers()
    }

    fun refresh(list:List<Player>?){

    }
}
