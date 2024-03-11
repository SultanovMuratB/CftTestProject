package com.sultanov.cfttestproject.data.users.domain

import com.sultanov.cfttestproject.data.users.data.dto.GetUsersResponseDto
import com.sultanov.cfttestproject.data.users.domain.entity.Coordinates
import com.sultanov.cfttestproject.data.users.domain.entity.Dob
import com.sultanov.cfttestproject.data.users.domain.entity.Id
import com.sultanov.cfttestproject.data.users.domain.entity.Location
import com.sultanov.cfttestproject.data.users.domain.entity.Login
import com.sultanov.cfttestproject.data.users.domain.entity.Name
import com.sultanov.cfttestproject.data.users.domain.entity.Picture
import com.sultanov.cfttestproject.data.users.domain.entity.Registered
import com.sultanov.cfttestproject.data.users.domain.entity.Street
import com.sultanov.cfttestproject.data.users.domain.entity.Timezone
import com.sultanov.cfttestproject.data.users.domain.entity.User

internal interface UserMapper {

    fun mapPicture(picture: GetUsersResponseDto.Picture) : Picture

    fun mapId(id: GetUsersResponseDto.Id) : Id

    fun mapRegistered(registered: GetUsersResponseDto.Registered) : Registered

    fun mapDob(dob: GetUsersResponseDto.Dob) : Dob

    fun mapLogin(login: GetUsersResponseDto.Login) : Login

    fun mapTimezone(timezone: GetUsersResponseDto.Timezone) : Timezone

    fun mapCoordinates(coordinates: GetUsersResponseDto.Coordinates) : Coordinates

    fun mapStreet(street: GetUsersResponseDto.Street) : Street

    fun mapName(name: GetUsersResponseDto.Name) : Name

    fun mapListLocation(location: GetUsersResponseDto.Location) : Location

    fun map(usersResponse: GetUsersResponseDto): List<User>
}
