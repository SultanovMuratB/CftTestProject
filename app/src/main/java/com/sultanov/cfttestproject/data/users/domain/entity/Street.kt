package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
internal data class Street(
    val number: String? = null,
    val name: String? = null,
) : Parcelable