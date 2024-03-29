package com.abraham.ecommerce_compose.domain.usecase.favorite

import com.abraham.ecommerce_compose.common.NetworkResponseState
import com.abraham.ecommerce_compose.domain.entity.product.FavoriteProductEntity
import kotlinx.coroutines.flow.Flow

interface FavoriteUseCase {
    suspend operator fun invoke(userId: String): Flow<NetworkResponseState<List<FavoriteProductEntity>>> // getFavoriteProductsFromLocal

    suspend operator fun invoke(item: FavoriteProductEntity) // insertFavoriteItemToDb
}
