package com.abraham.ecommerce_compose.domain.usecase.product

import com.abraham.ecommerce_compose.common.NetworkResponseState
import com.abraham.ecommerce_compose.domain.entity.product.ProductEntity
import kotlinx.coroutines.flow.Flow

interface SearchProductUseCase {
    operator fun invoke(query: String): Flow<NetworkResponseState<List<ProductEntity>>>
}
