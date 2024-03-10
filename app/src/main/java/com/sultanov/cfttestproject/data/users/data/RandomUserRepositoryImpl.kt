package com.sultanov.cfttestproject.data.users.data

import com.sultanov.cfttestproject.data.users.domain.RandomUserRepository
import com.sultanov.cfttestproject.data.users.domain.User

internal class RandomUserRepositoryImpl(
    private val usersServiceApi: UsersServiceApi,
    private val usersMapper: UsersMapperImpl,
) : RandomUserRepository {


    override suspend fun getUsers(): List<User> {
        val usersResponseDto = usersServiceApi.getUsers()
        return usersMapper.map(usersResponseDto)
    }
}
