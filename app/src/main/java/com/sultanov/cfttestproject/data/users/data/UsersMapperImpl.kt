package com.sultanov.cfttestproject.data.users.data

import com.sultanov.cfttestproject.data.users.data.dto.GetUsersResponseDto
import com.sultanov.cfttestproject.data.users.domain.Coordinates
import com.sultanov.cfttestproject.data.users.domain.Dob
import com.sultanov.cfttestproject.data.users.domain.Id
import com.sultanov.cfttestproject.data.users.domain.Location
import com.sultanov.cfttestproject.data.users.domain.Login
import com.sultanov.cfttestproject.data.users.domain.Name
import com.sultanov.cfttestproject.data.users.domain.Picture
import com.sultanov.cfttestproject.data.users.domain.Registered
import com.sultanov.cfttestproject.data.users.domain.Street
import com.sultanov.cfttestproject.data.users.domain.Timezone
import com.sultanov.cfttestproject.data.users.domain.User
import com.sultanov.cfttestproject.data.users.domain.UserMapper

internal class UsersMapperImpl : UserMapper {

    override fun map(usersResponse: GetUsersResponseDto): List<User> {
        return usersResponse.users.map { user ->
            User(
                gender = user.gender,
                name = mapName(user.name),
                location = mapListLocation(user.location),
                email = user.email,
                login = mapLogin(user.login),
                dob = mapDob(user.dob),
                registered = mapRegistered(user.registered),
                phone = user.phone,
                cell = user.cell,
                id = mapId(user.id),
                picture = mapPicture(user.picture),
                nat = user.nat,
            )
        }
    }

    override fun mapRegistered(registered: GetUsersResponseDto.Registered): Registered {
        return Registered(
            date = registered.date,
            age = registered.age,
        )
    }

    override fun mapPicture(picture: GetUsersResponseDto.Picture): Picture {
        return Picture(
            large = picture.large,
            medium = picture.medium,
            thumbnail = picture.thumbnail,
        )
    }

    override fun mapName(name: GetUsersResponseDto.Name): Name {
        return Name(
            title = name.title,
            first = name.first,
            last = name.last,
        )
    }

    override fun mapStreet(street: GetUsersResponseDto.Street): Street {
        return Street(
            number = street.number,
            name = street.name,
        )
    }

    override fun mapTimezone(timezone: GetUsersResponseDto.Timezone): Timezone {
        return Timezone(
            offset = timezone.offset,
            description = timezone.description,
        )
    }

    override fun mapLogin(login: GetUsersResponseDto.Login): Login {
        return Login(
            uuid = login.uuid,
            username = login.username,
            password = login.password,
            salt = login.salt,
            md5 = login.md5,
            sha1 = login.sha1,
            sha256 = login.sha256,
        )
    }

    override fun mapListLocation(location: GetUsersResponseDto.Location): Location {
        return Location(
            street = mapStreet(location.street),
            city = location.city,
            state = location.state,
            country = location.country,
            postcode = location.postcode,
            timezone = mapTimezone(location.timezone),
            coordinates = mapCoordinates(location.coordinates),
        )
    }

    override fun mapId(id: GetUsersResponseDto.Id): Id {
        return Id(
            name = id.name,
            value = id.value,
        )
    }

    override fun mapDob(dob: GetUsersResponseDto.Dob): Dob {
        return Dob(
            date = dob.date,
            age = dob.age,
        )
    }

    override fun mapCoordinates(coordinates: GetUsersResponseDto.Coordinates): Coordinates {
        return Coordinates(
            latitude = coordinates.latitude,
            longitude = coordinates.longitude,
        )
    }
}
