package com.example.retrofit_tutor.data.Repository

import com.example.retrofit_tutor.data.Apis
import com.example.retrofit_tutor.data.model.Product
import kotlinx.coroutines.flow.Flow
import retrofit2.HttpException
import java.io.IOException
import com.example.retrofit_tutor.data.Result
import com.example.retrofit_tutor.data.model.Products
import kotlinx.coroutines.flow.flow

class ProductRepoImpl(
    private val api: Apis
) : ProductRepo {
    override suspend fun getProductsList(): Flow<Result<List<Product>>> {
        return flow {
            val productApi = try {
                api.getProductsList()
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            } catch (e: Exception) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            }
           val data= Result.Success(productApi.products)
            emit(data)
        }

    }
//
//    override suspend fun getProduct(id: String): Flow<Result<Product>> {
//        TODO("Not yet implemented")
//    }
}