package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.IdDto
import com.sultanov.cfttestproject.domain.item.Id

class IdMapper {

    fun mapIdToDto(id: Id): IdDto {
        return IdDto(
            name = id.name,
            value = id.value
        )
    }

    fun mapDtoToId(idDto: IdDto): Id {
        return Id(
            name = idDto.name,
            value = idDto.value
        )
    }
}