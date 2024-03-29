package com.abraham.ecommerce_compose.domain.usecase.cart

import com.abraham.ecommerce_compose.common.NetworkResponseState
import com.abraham.ecommerce_compose.domain.entity.cart.UserCartEntity
import kotlinx.coroutines.flow.Flow

interface CartUseCase {
    suspend operator fun invoke(userId: String): Flow<NetworkResponseState<List<UserCartEntity>>> // getCartsByUserIdFromLocal

    suspend operator fun invoke(userCartEntity: UserCartEntity) // insertCartToDb
}
