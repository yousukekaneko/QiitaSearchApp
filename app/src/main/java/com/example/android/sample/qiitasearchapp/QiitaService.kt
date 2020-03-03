package com.example.android.sample.qiitasearchapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface QiitaService {

    @GET("items")
    fun apiGet(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Call<List<QiitaItem>>
}