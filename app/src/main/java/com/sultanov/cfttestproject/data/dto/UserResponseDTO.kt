package com.sultanov.cfttestproject.data.dto

import com.google.gson.annotations.SerializedName

data class UserResponseDTO(
    @SerializedName("results")
    val resultUserDto: List<ResultUserDto>
)