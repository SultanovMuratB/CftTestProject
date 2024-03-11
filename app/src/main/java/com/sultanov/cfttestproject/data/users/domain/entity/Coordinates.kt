package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
internal data class Coordinates(
    val latitude: String? = null,
    val longitude: String? = null,
) : Parcelable
