package com.abraham.ecommerce_compose.domain.usecase.product

import com.abraham.ecommerce_compose.common.NetworkResponseState
import com.abraham.ecommerce_compose.domain.entity.product.DetailProductEntity
import com.abraham.ecommerce_compose.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSingleProductUseCaseImpl @Inject constructor(
    private val repository: RemoteRepository,
) : GetSingleProductUseCase {
    override fun invoke(id: Int): Flow<NetworkResponseState<DetailProductEntity>> =
        repository.getSingleProductByIdFromApi(id)
}
