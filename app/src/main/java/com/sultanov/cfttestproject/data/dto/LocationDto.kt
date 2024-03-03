package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class LocationDto(
    @SerializedName("street")
    var street: List<StreetDto>,
    @SerializedName("city")
    var city: String,
    @SerializedName("state")
    var state: String,
    @SerializedName("country")
    var country: String,
    @SerializedName("postcode")
    var postcode: String,
    @SerializedName("coordinates")
    var coordinates: List<CoordinatesDto>,
    @SerializedName("timezone")
    var timezone: List<TimezoneDto>,
)