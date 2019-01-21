package com.dejodido.udemyhttp3

import android.content.Context
import android.net.ConnectivityManager
import android.support.v7.app.AppCompatActivity

class Network {
   companion object {
       fun isNetwork(activity: AppCompatActivity):Boolean{
           var connectivityManager = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
           var info = connectivityManager.activeNetworkInfo
           return info!=null && info.isConnected


       }
   }
}