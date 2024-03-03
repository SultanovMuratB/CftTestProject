package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.CoordinatesDto
import com.sultanov.cfttestproject.domain.item.Coordinates

class CoordinatesMapper {

    fun mapCoordinatesToDto(coordinates: Coordinates): CoordinatesDto {
        return CoordinatesDto(
            latitude = coordinates.latitude,
            longitude = coordinates.longitude
        )
    }

    fun mapDtoToCoordinates(coordinatesDto: CoordinatesDto) : Coordinates {
        return Coordinates(
            latitude = coordinatesDto.latitude,
            longitude = coordinatesDto.longitude
        )
    }
}