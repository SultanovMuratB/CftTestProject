package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
internal data class Registered(
    val date: String? = null,
    val age: String? = null,
) : Parcelable