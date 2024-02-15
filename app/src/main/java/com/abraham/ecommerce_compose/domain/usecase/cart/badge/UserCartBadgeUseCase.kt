package com.abraham.ecommerce_compose.domain.usecase.cart.badge

import com.abraham.ecommerce_compose.common.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface UserCartBadgeUseCase {
    suspend operator fun invoke(userId: String): Flow<NetworkResponseState<Int>>
}