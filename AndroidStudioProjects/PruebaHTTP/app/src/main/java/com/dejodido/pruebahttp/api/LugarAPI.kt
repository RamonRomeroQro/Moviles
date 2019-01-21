package com.dejodido.pruebahttp.api


import com.dejodido.pruebahttp.models.ListaLugares
import retrofit2.Call
import retrofit2.http.GET

interface LugarAPI {
    @GET("?location=20.5924074,-100.3788854&radius=5000&types=amusement_park|bar&key=AIzaSyCXm58tMXQ48sO1IKP956SRE-hrwswn1GQ")
    fun getPhoto(): Call<ListaLugares>
}