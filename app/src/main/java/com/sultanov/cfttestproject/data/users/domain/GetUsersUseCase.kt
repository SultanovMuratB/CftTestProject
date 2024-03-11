package com.sultanov.cfttestproject.data.users.domain

import androidx.annotation.WorkerThread
import com.sultanov.cfttestproject.data.users.domain.entity.User

internal interface GetUsersUseCase {

    @WorkerThread
    suspend fun getUsers(): List<User>
}
