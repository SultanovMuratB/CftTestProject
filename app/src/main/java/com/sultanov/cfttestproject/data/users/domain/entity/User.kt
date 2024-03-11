package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
internal data class User(
    val gender: String? = null,
    val name: Name,
    val location: Location,
    val email: String? = null,
    val login: Login,
    val dob: Dob,
    val registered: Registered,
    val phone: String? = null,
    val cell: String? = null,
    val id: Id,
    val picture: Picture,
    val nat: String? = null,
) : Parcelable

