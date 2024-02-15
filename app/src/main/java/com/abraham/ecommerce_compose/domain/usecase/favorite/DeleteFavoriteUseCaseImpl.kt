package com.abraham.ecommerce_compose.domain.usecase.favorite

import com.abraham.ecommerce_compose.domain.entity.product.FavoriteProductEntity
import com.abraham.ecommerce_compose.domain.repository.LocalRepository
import javax.inject.Inject

class DeleteFavoriteUseCaseImpl @Inject constructor(
    private val repository: LocalRepository,
) : DeleteFavoriteUseCase {
    override suspend fun invoke(favoriteProductEntity: FavoriteProductEntity) {
        repository.deleteFavoriteProduct(favoriteProductEntity)
    }
}
