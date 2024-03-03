package com.sultanov.cfttestproject.data.mapper

import com.sultanov.cfttestproject.data.dto.PictureDto
import com.sultanov.cfttestproject.domain.item.Picture

class PictureMapper {

    fun mapPictureToDto(picture: Picture): PictureDto {
        return PictureDto(
            large = picture.large,
            medium = picture.medium,
            thumbnail = picture.thumbnail,
        )
    }

    fun mapDtoToPicture(pictureDto: PictureDto): Picture {
        return Picture(
            large = pictureDto.large,
            medium = pictureDto.medium,
            thumbnail = pictureDto.thumbnail,
        )
    }
}