package com.abraham.ecommerce_compose.domain.usecase.favorite

import com.abraham.ecommerce_compose.domain.entity.product.FavoriteProductEntity

interface DeleteFavoriteUseCase {
    suspend operator fun invoke(favoriteProductEntity: FavoriteProductEntity)
}