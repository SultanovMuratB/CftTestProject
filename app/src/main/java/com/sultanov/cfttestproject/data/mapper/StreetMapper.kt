package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.StreetDto
import com.sultanov.cfttestproject.domain.item.Street

class StreetMapper {

    fun mapStreetToDto(street: Street): StreetDto {
        return StreetDto(
            number = street.number,
            name = street.name,
        )
    }

    fun mapDtoToStreet(streetDto: StreetDto): Street {
        return Street(
            number = streetDto.number,
            name = streetDto.name,
        )
    }
}