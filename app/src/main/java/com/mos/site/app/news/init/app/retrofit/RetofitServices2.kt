package com.mos.site.app.news.init.app.retrofit

import com.mos.site.app.news.init.app.dataclass.match
import com.mos.site.app.news.init.app.dataclass.paramApiItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface RetofitServices2 : RetrofitServices {

    @GET("1xbet/football/live/{id}")
    fun getMovieList(@Header("Authorization") token: String, @Path("id") id: Int): Call<MutableList<match>>

}