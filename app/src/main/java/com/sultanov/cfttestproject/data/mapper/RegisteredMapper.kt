package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.RegisteredDto
import com.sultanov.cfttestproject.domain.item.Registered

class RegisteredMapper {

    fun mapRegisteredToDto(registered: Registered): RegisteredDto {
        return RegisteredDto(
            phone = registered.phone,
            cell = registered.cell,
        )
    }

    fun mapDtoToRegistered(registeredDto: RegisteredDto): Registered {
        return Registered(
            phone = registeredDto.phone,
            cell = registeredDto.cell,
        )
    }
}