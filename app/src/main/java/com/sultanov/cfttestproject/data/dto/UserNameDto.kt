package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class UserNameDto(
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("first")
    var first: String? = null,
    @SerializedName("last")
    var last: String? = null
)