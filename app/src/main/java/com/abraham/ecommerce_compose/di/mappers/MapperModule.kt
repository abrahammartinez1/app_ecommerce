package com.abraham.ecommerce_compose.di.mappers

import com.abraham.ecommerce_compose.domain.entity.product.DetailProductEntity
import com.abraham.ecommerce_compose.domain.entity.product.ProductEntity
import com.abraham.ecommerce_compose.domain.mapper.ProductBaseMapper
import com.abraham.ecommerce_compose.domain.mapper.ProductListMapper
import com.abraham.ecommerce_compose.data.dto.Product
import com.abraham.ecommerce_compose.data.mapper.ProductEntityMapper
import com.abraham.ecommerce_compose.data.mapper.SingleProductEntityMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class MapperModule {

    @Binds
    @ViewModelScoped
    abstract fun bindAllProductsEntityMapper(productEntityMapper: ProductEntityMapper): ProductListMapper<Product, ProductEntity>

    @Binds
    @ViewModelScoped
    abstract fun bindSingleProductEntityMapper(singleProductEntityMapper: SingleProductEntityMapper): ProductBaseMapper<Product, DetailProductEntity>
}
