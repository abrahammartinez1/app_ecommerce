package com.abraham.ecommerce_compose.domain.usecase.cart

import com.abraham.ecommerce_compose.domain.entity.cart.UserCartEntity

interface DeleteUserCartUseCase {
    suspend operator fun invoke(userCartEntity: UserCartEntity)
}
