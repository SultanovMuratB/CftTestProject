package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class StreetDto(
    @SerializedName("number")
    var number: String,
    @SerializedName("name")
    var name: String
)