package com.mos.site.app.news.init.app.retrofit

object Common2 {
    private val BASE_URL = "https://api.betting-api.com/"
    val retrofitService2: RetofitServices2
        get() = RetrofitClient.getClient(BASE_URL).create(RetofitServices2::class.java)
}