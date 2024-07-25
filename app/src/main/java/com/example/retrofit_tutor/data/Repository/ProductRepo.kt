package com.example.retrofit_tutor.data.Repository

import com.example.retrofit_tutor.data.model.Result
import com.example.retrofit_tutor.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepo {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
//    suspend fun getProduct(id: String): Flow<Result<Product>>

}