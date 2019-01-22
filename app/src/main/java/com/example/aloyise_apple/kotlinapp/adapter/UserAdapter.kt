package com.example.aloyise_apple.kotlinapp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.aloyise_apple.kotlinapp.bean.User

/**
Created by Aloyise 2019/1/18
Description:
 */
class UserAdapter(context: Context): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    var list:ArrayList<User> = ArrayList()

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class UserViewHolder(item: View) : RecyclerView.ViewHolder(item) {

    }
}