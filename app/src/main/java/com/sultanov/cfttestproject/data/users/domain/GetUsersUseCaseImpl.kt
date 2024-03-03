package com.sultanov.cfttestproject.data.users.domain

import androidx.annotation.WorkerThread

internal class GetUsersUseCaseImpl(
    private val randomUserRepository: RandomUserRepository,
) : GetUsersUseCase {

    @WorkerThread
    override suspend fun getUsers(): List<User> {
        return randomUserRepository.getUsers()
    }
}
