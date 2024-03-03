package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class DobDto(
    @SerializedName("date")
    var date: String,
    @SerializedName("age")
    var age: String,
)
