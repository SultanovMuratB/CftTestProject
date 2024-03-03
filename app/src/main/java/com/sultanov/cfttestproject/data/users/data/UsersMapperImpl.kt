package com.sultanov.cfttestproject.data.users.data

import com.sultanov.cfttestproject.data.users.data.dto.GetUsersResponseDto
import com.sultanov.cfttestproject.data.users.domain.User
import com.sultanov.cfttestproject.data.users.domain.UserMapper

internal class UsersMapperImpl : UserMapper {

    override fun map(usersResponse: GetUsersResponseDto): List<User> {
        return usersResponse.users.map { user ->
            User(
                gender = user.gender,
                email = user.email,
                phone = user.phone,
                cell = user.cell,
            )
        }
    }
}
