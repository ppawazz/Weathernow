package com.example.weathernow.Utilities

import com.example.weathernow.Models.ModelWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface InterfaceApi {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") appid: String
    ): Call<ModelWeather>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q: String,
        @Query("appid") appid: String
    ): Call<ModelWeather>
}