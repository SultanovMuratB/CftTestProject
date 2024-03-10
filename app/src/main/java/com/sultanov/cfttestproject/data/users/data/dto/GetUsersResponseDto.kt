package com.sultanov.cfttestproject.data.users.data.dto

import com.google.gson.annotations.SerializedName

internal data class GetUsersResponseDto(
    @SerializedName("results")
    val users: List<User>,
) {

    data class User(
        @SerializedName("gender")
        val gender: String? = null,
        @SerializedName("name")
        val name: Name,
        @SerializedName("location")
        val location: Location,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("login")
        val login: Login,
        @SerializedName("dob")
        val dob: Dob,
        @SerializedName("registered")
        val registered: Registered,
        @SerializedName("phone")
        val phone: String? = null,
        @SerializedName("cell")
        val cell: String? = null,
        @SerializedName("id")
        val id: Id,
        @SerializedName("picture")
        val picture: Picture,
        @SerializedName("nat")
        val nat: String? = null,
    )

    data class Picture(
        @SerializedName("large")
        val large: String? = null,
        @SerializedName("medium")
        val medium: String? = null,
        @SerializedName("thumbnail")
        val thumbnail: String? = null,
    )

    data class Id(
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("value")
        val value: String? = null,
    )

    data class Registered(
        @SerializedName("date")
        val date: String? = null,
        @SerializedName("age")
        val age: String? = null,
    )

    data class Dob(
        @SerializedName("date")
        val date: String? = null,
        @SerializedName("age")
        val age: String? = null,
    )

    data class Login(
        @SerializedName("uuid")
        val uuid: String? = null,
        @SerializedName("username")
        val username: String? = null,
        @SerializedName("password")
        val password: String? = null,
        @SerializedName("salt")
        val salt: String? = null,
        @SerializedName("md5")
        val md5: String? = null,
        @SerializedName("sha1")
        val sha1: String? = null,
        @SerializedName("sha256")
        val sha256: String? = null,
    )

    data class Location(
        @SerializedName("street")
        val street: Street,
        @SerializedName("city")
        val city: String? = null,
        @SerializedName("state")
        val state: String? = null,
        @SerializedName("country")
        val country: String? = null,
        @SerializedName("postcode")
        val postcode: String? = null,
        @SerializedName("coordinates")
        val coordinates: Coordinates,
        @SerializedName("timezone")
        val timezone: Timezone,
    )

    data class Timezone(
        @SerializedName("offset")
        val offset: String? = null,
        @SerializedName("description")
        val description: String? = null,
    )

    data class Coordinates(
        @SerializedName("latitude")
        val latitude: String? = null,
        @SerializedName("longitude")
        val longitude: String? = null,
    )

    data class Street(
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("number")
        val number: String? = null,
    )

    data class Name(
        @SerializedName("title")
        val title: String? = null,
        @SerializedName("first")
        val first: String? = null,
        @SerializedName("last")
        val last: String? = null,
    )
}
