package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class TimezoneDto(
    @SerializedName("offset")
    var offset: String,
    @SerializedName("description")
    var description: String
)