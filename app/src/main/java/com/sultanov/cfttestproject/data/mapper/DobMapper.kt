package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.DobDto
import com.sultanov.cfttestproject.domain.item.Dob

class DobMapper {

    fun mapDobToDto(dob: Dob): DobDto {
        return DobDto(
            date = dob.date,
            age = dob.age
        )
    }

    fun mapDtoToDob(dobDto: DobDto): Dob {
        return Dob(
            date = dobDto.date,
            age = dobDto.age
        )
    }
}