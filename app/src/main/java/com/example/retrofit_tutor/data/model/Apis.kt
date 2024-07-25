package com.example.retrofit_tutor.data.model

import retrofit2.http.GET

interface Apis {
    @GET("/products")
    suspend fun getProductsList(): Products

//    @GET("/product/{id}")
//    suspend fun getProduct(
//        @Path("id") id: String
//    ): Product

    companion object {
        const val BASE_URL = "https://dummyjson.com"
    }


}