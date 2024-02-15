package com.abraham.ecommerce_compose.di.repository

import com.abraham.ecommerce_compose.domain.repository.FirebaseRepository
import com.abraham.ecommerce_compose.domain.repository.LocalRepository
import com.abraham.ecommerce_compose.domain.repository.RemoteRepository
import com.abraham.ecommerce_compose.data.repository.FirebaseRepositoryImpl
import com.abraham.ecommerce_compose.data.repository.LocalRepositoryImpl
import com.abraham.ecommerce_compose.data.repository.RemoteRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRemoteRepository(
        repository: RemoteRepositoryImpl,
    ): RemoteRepository

    @Binds
    @ViewModelScoped
    abstract fun bindLocalRepository(
        repository: LocalRepositoryImpl,
    ): LocalRepository

    @Binds
    @ViewModelScoped
    abstract fun bindFirebaseRepository(
        repository: FirebaseRepositoryImpl,
    ): FirebaseRepository
}
