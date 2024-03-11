package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
internal data class Name(
    val title: String? = null,
    val first: String? = null,
    val last: String? = null,
) : Parcelable