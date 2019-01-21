package com.dejodido.pruebahttp.api

import com.dejodido.pruebahttp.models.ListaLugares
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Recuperador {
    private val service : LugarAPI

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/json")
                .addConverterFactory(GsonConverterFactory.create()).build()
        val service = retrofit.create(LugarAPI::class.java)

    }
    fun getlugares (callback: Callback<ListaLugares>){
        val call=service.getPhoto()
        call.enqueue(callback)
    }
}