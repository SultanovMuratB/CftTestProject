package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class PictureDto(
    @SerializedName("large")
    var large: String,
    @SerializedName("medium")
    var medium: String,
    @SerializedName("thumbnail")
    var thumbnail: String,
)
