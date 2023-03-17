package com.mos.site.app.news.init.app.retrofit

object Common {
    private val BASE_URL = "https://api.betting-api.com/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}