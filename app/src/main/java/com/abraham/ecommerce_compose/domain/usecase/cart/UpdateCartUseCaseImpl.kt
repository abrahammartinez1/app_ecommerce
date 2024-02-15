package com.abraham.ecommerce_compose.domain.usecase.cart // ktlint-disable package-name

import com.abraham.ecommerce_compose.domain.entity.cart.UserCartEntity
import com.abraham.ecommerce_compose.domain.repository.LocalRepository
import javax.inject.Inject

class UpdateCartUseCaseImpl @Inject constructor(
    private val repository: LocalRepository,
) : UpdateCartUseCase {
    override suspend fun invoke(userCartEntity: UserCartEntity) {
        repository.updateUserCart(userCartEntity)
    }
}
