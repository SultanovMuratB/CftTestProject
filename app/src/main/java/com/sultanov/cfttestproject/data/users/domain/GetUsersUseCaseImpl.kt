package com.sultanov.cfttestproject.data.users.domain

import androidx.annotation.WorkerThread
import com.sultanov.cfttestproject.data.users.domain.entity.User
import javax.inject.Inject

internal class GetUsersUseCaseImpl @Inject constructor(
    private val randomUserRepository: RandomUserRepository,
) : GetUsersUseCase {

    @WorkerThread
    override suspend fun getUsers(): List<User> {
        return randomUserRepository.getUsers()
    }
}
