package com.abraham.ecommerce_compose.di.usecase

import com.abraham.ecommerce_compose.domain.usecase.cart.CartUseCase
import com.abraham.ecommerce_compose.domain.usecase.cart.CartUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.cart.DeleteUserCartUseCase
import com.abraham.ecommerce_compose.domain.usecase.cart.DeleteUserCartUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.cart.UpdateCartUseCase
import com.abraham.ecommerce_compose.domain.usecase.cart.UpdateCartUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.cart.badge.UserCartBadgeUseCase
import com.abraham.ecommerce_compose.domain.usecase.cart.badge.UserCartBadgeUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.category.CategoryUseCase
import com.abraham.ecommerce_compose.domain.usecase.category.CategoryUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.favorite.DeleteFavoriteUseCase
import com.abraham.ecommerce_compose.domain.usecase.favorite.DeleteFavoriteUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.favorite.FavoriteUseCase
import com.abraham.ecommerce_compose.domain.usecase.favorite.FavoriteUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.product.GetAllProductsUseCase
import com.abraham.ecommerce_compose.domain.usecase.product.GetAllProductsUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.product.GetSingleProductUseCase
import com.abraham.ecommerce_compose.domain.usecase.product.GetSingleProductUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.product.SearchProductUseCase
import com.abraham.ecommerce_compose.domain.usecase.product.SearchProductUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.user.forget_pw.ForgotPwFirebaseUserUseCase
import com.abraham.ecommerce_compose.domain.usecase.user.forget_pw.ForgotPwFirebaseUserUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.user.read_user.ReadFirebaseUserInfosUseCase
import com.abraham.ecommerce_compose.domain.usecase.user.read_user.ReadFirebaseUserInfosUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.user.sign_in.FirebaseUserSingInUseCase
import com.abraham.ecommerce_compose.domain.usecase.user.sign_in.FirebaseUserSingInUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.user.sign_up.FirebaseUserSignUpUseCase
import com.abraham.ecommerce_compose.domain.usecase.user.sign_up.FirebaseUserSignUpUseCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.user.write_user.WriteFirebaseUserInfosCaseImpl
import com.abraham.ecommerce_compose.domain.usecase.user.write_user.WriteFirebaseUserInfosUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGetAllProductsUseCase(
        getAllProductsUseCaseImpl: GetAllProductsUseCaseImpl,
    ): GetAllProductsUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindGetSingleProductUseCase(
        getSingleProductUseCaseImpl: GetSingleProductUseCaseImpl,
    ): GetSingleProductUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindGetAllCategoryUseCase(
        getAllCategoryUseCaseImpl: CategoryUseCaseImpl,
    ): CategoryUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindCartUseCase(
        cartUseCaseImpl: CartUseCaseImpl,
    ): CartUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindDeleteUserCartUseCase(
        deleteUserCartUseCaseImpl: DeleteUserCartUseCaseImpl,
    ): DeleteUserCartUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindSearchUseCase(
        searchUseCaseImpl: SearchProductUseCaseImpl,
    ): SearchProductUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindUpdateCartUseCase(
        updateCartUseCaseImpl: UpdateCartUseCaseImpl,
    ): UpdateCartUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindFavoriteUseCase(
        favoriteUseCaseImpl: FavoriteUseCaseImpl,
    ): FavoriteUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindDeleteFavoriteUseCase(
        deleteFavoriteUseCaseImpl: DeleteFavoriteUseCaseImpl,
    ): DeleteFavoriteUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindFirebaseSignUpUseCase(
        firebaseSignUpUseCaseImpl: FirebaseUserSignUpUseCaseImpl,
    ): FirebaseUserSignUpUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindFirebaseSignInUseCase(
        firebaseSignInUseCaseImpl: FirebaseUserSingInUseCaseImpl,
    ): FirebaseUserSingInUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindFirebaseForgetPwUseCase(
        firebaseForgetPwUseCaseImpl: ForgotPwFirebaseUserUseCaseImpl,
    ): ForgotPwFirebaseUserUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindFirebaseWriteUserUseCase(
        firebaseWriteUserUseCaseImpl: WriteFirebaseUserInfosCaseImpl,
    ): WriteFirebaseUserInfosUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindFirebaseReadUserUseCase(
        firebaseReadUserCaseImpl: ReadFirebaseUserInfosUseCaseImpl,
    ): ReadFirebaseUserInfosUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindUserCartBadgeUseCase(
        userCartBadgeUseCaseImpl: UserCartBadgeUseCaseImpl,
    ): UserCartBadgeUseCase
}
