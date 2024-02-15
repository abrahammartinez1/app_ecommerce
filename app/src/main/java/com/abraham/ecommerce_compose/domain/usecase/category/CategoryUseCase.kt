package com.abraham.ecommerce_compose.domain.usecase.category

import com.abraham.ecommerce_compose.common.NetworkResponseState
import kotlinx.coroutines.flow.Flow

interface CategoryUseCase {
    operator fun invoke(): Flow<NetworkResponseState<List<String>>>
}
