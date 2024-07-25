package com.example.retrofit_tutor.utils

import com.example.retrofit_tutor.data.model.Apis
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val client = OkHttpClient.Builder().apply {
        addInterceptor(interceptor)
    }.build()

    val api: Apis = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Apis.BASE_URL)
        .build()
        .create(Apis::class.java)
}