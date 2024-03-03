package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.ResultUserDto
import com.sultanov.cfttestproject.data.dto.UserResponseDTO
import com.sultanov.cfttestproject.domain.item.ResultUser

class ResultUserMapper {

    private fun mapResultUserDtoToResultUser(resultUserDto: ResultUserDto) : ResultUser {
        return ResultUser(
            gender = resultUserDto.gender,
            email = resultUserDto.email,
            phone = resultUserDto.phone,
            cell = resultUserDto.cell
        )
    }

    fun mapListResultUserDtoToListResultUser(userResponseDTO: UserResponseDTO) =
        userResponseDTO.resultUserDto.map {
            mapResultUserDtoToResultUser(it)
        }
}