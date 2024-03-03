package com.sultanov.cfttestproject.data.users.data.dto

import com.google.gson.annotations.SerializedName

internal data class GetUsersResponseDto(
    @SerializedName("results")
    val users: List<User>,
) {

    data class User(
        @SerializedName("gender")
        val gender: String? = null,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("phone")
        val phone: String? = null,
        @SerializedName("cell")
        val cell: String? = null,
    )
}
