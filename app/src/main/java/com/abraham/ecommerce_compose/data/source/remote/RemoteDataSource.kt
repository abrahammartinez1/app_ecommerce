package com.abraham.ecommerce_compose.data.source.remote

import com.abraham.ecommerce_compose.common.NetworkResponseState
import com.abraham.ecommerce_compose.data.dto.Product
import com.abraham.ecommerce_compose.data.dto.Products
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getProductsListFromApi(): Flow<NetworkResponseState<Products>>

    fun getSingleProductByIdFromApi(productId: Int): Flow<NetworkResponseState<Product>>

    fun getProductsListBySearchFromApi(query: String): Flow<NetworkResponseState<Products>>

    fun getAllCategoriesListFromApi(): Flow<NetworkResponseState<List<String>>>

    fun getProductsListByCategoryNameFromApi(categoryName: String): Flow<NetworkResponseState<Products>>
}
