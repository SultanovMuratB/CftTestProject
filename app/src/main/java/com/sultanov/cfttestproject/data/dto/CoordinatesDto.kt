package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class CoordinatesDto(
    @SerializedName("latitude")
    var latitude: String,
    @SerializedName("longitude")
    var longitude: String
)