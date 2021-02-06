package com.example.pedometerapplication

import android.content.Context
import android.content.SharedPreferences

class UserInfopref (context: Context){

    var pref :SharedPreferences
    val prefName = "UserInfo"
    init{
        pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)
    }



}