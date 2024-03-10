package com.sultanov.cfttestproject.data.users.domain

import androidx.annotation.WorkerThread
internal interface RandomUserRepository {

    @WorkerThread
    suspend fun getUsers(): List<User>
}
