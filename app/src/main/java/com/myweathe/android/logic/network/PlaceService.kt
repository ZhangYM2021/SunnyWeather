package com.myweathe.android.logic.network

import com.myweathe.android.MyWeatherApplication
import com.myweathe.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface PlaceService {
    @GET("v2/place?token=${MyWeatherApplication.TOKEN}&lang=zh_CN")
    fun seacherPlaces(@Query("query") query: String): Call<PlaceResponse>
}