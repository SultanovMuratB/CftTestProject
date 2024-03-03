package com.sultanov.cfttestproject.data.users.data

import androidx.annotation.WorkerThread
import com.sultanov.cfttestproject.data.users.domain.RandomUserRepository
import com.sultanov.cfttestproject.data.users.domain.User

internal class RandomUserRepositoryImpl(
    private val usersServiceApi: UsersServiceApi,
    private val usersMapper: UsersMapperImpl,
) : RandomUserRepository {

    @WorkerThread
    override suspend fun getUsers(): List<User> {
        val usersResponseDto = usersServiceApi.getUsers()
        return usersMapper.map(usersResponseDto)
    }
}
