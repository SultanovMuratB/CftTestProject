package com.sultanov.cfttestproject.data.users.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
internal data class Timezone(
    val offset: String? = null,
    val description: String? = null,
) : Parcelable