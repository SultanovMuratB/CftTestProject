package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class ResultUserDto(
    @SerializedName("gender")
    var gender : String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("cell")
    var cell: String? = null
)