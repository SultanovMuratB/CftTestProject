package com.sultanov.cfttestproject.data.users.domain

import com.sultanov.cfttestproject.data.users.data.dto.GetUsersResponseDto

internal interface UserMapper {

    fun map(usersResponse: GetUsersResponseDto): List<User>
}
