package com.mos.site.app.news.init.app.retrofit

import com.mos.site.app.news.init.app.dataclass.paramApiItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface RetrofitServices {

    @GET("1xbet/football/live/all")
    fun getMovieList(@Header("Authorization") token: String): Call<MutableList<paramApiItem>>

}