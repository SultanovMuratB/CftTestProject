package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class IdDto(
    @SerializedName("name")
    var name: String,
    @SerializedName("value")
    var value: String,
)