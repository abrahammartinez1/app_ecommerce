package com.abraham.ecommerce_compose.domain.usecase.user.sign_in

import com.abraham.ecommerce_compose.domain.entity.user.FirebaseSignInUserEntity
import com.abraham.ecommerce_compose.domain.entity.user.UserInformationEntity
import com.abraham.ecommerce_compose.domain.repository.FirebaseRepository
import javax.inject.Inject

class FirebaseUserSingInUseCaseImpl @Inject constructor(
    private val firebaseRepository: FirebaseRepository
): FirebaseUserSingInUseCase {
    override fun invoke(user: FirebaseSignInUserEntity, onSuccess: (UserInformationEntity) -> Unit, onFailure: (String) -> Unit) {
        firebaseRepository.signInWithFirebase(user, onSuccess, onFailure)
    }
}