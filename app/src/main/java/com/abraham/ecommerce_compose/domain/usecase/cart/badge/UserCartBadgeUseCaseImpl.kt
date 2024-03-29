package com.abraham.ecommerce_compose.domain.usecase.cart.badge

import com.abraham.ecommerce_compose.common.NetworkResponseState
import com.abraham.ecommerce_compose.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserCartBadgeUseCaseImpl @Inject constructor(
    private val repository: LocalRepository,
) : UserCartBadgeUseCase {
    override suspend fun invoke(userId: String): Flow<NetworkResponseState<Int>> {
        return repository.getBadgeCountFromDb(userId)
    }
}
