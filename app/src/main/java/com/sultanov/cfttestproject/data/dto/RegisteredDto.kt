package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class RegisteredDto(
    @SerializedName("phone")
    var phone: String,
    @SerializedName("cell")
    var cell: String,
)
