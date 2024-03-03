package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("gender")
    var gender: String,
    @SerializedName("name")
    var name: List<UserNameDto>,
    @SerializedName("location")
    var location: List<LocationDto>,
    @SerializedName("email")
    var email: String,
    @SerializedName("login")
    var login: List<LoginDto>,
    @SerializedName("dob")
    var dob: List<DobDto>,
    @SerializedName("registered")
    var registered: List<RegisteredDto>,
    @SerializedName("id")
    var id: List<IdDto>,
    @SerializedName("picture")
    var picture: List<PictureDto>,
    @SerializedName("nat")
    var nat: String
)