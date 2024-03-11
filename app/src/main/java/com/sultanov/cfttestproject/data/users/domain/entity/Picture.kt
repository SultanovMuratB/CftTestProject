package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
internal data class Picture(
    val large: String? = null,
    val medium: String? = null,
    val thumbnail: String? = null,
) : Parcelable