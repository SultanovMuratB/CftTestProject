package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
internal data class Id(
    val name: String? = null,
    val value: String? = null,
) : Parcelable