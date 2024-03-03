package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.TimezoneDto
import com.sultanov.cfttestproject.domain.item.Timezone

class TimezoneMapper {

    fun mapTimezoneToDto(timezone: Timezone): TimezoneDto {
        return TimezoneDto(
            offset = timezone.offset,
            description = timezone.description,
        )
    }

    fun mapDtoToTimezone(timezoneDto: TimezoneDto): Timezone {
        return Timezone(
            offset = timezoneDto.offset,
            description = timezoneDto.description,
        )
    }
}