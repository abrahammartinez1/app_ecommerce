package com.abraham.ecommerce_compose.domain.usecase.user.sign_in

import com.abraham.ecommerce_compose.domain.entity.user.FirebaseSignInUserEntity
import com.abraham.ecommerce_compose.domain.entity.user.UserInformationEntity

interface FirebaseUserSingInUseCase {
    operator fun invoke(
        user: FirebaseSignInUserEntity,
        onSuccess: (UserInformationEntity) -> Unit,
        onFailure: (String) -> Unit
    )
}