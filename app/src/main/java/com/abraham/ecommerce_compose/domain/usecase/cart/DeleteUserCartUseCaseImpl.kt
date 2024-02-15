package com.abraham.ecommerce_compose.domain.usecase.cart

import com.abraham.ecommerce_compose.domain.entity.cart.UserCartEntity
import com.abraham.ecommerce_compose.domain.repository.LocalRepository
import javax.inject.Inject

class DeleteUserCartUseCaseImpl @Inject constructor(private val repository: LocalRepository) :
    DeleteUserCartUseCase {
    override suspend fun invoke(userCartEntity: UserCartEntity) {
        repository.deleteUserCart(userCartEntity)
    }
}
