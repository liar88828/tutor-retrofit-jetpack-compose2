package com.example.retrofit_tutor.data

import com.example.retrofit_tutor.data.model.Product
import com.example.retrofit_tutor.data.model.Products
import retrofit2.http.GET
import retrofit2.http.Path

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