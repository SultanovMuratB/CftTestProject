package com.sultanov.cfttestproject.domain

import com.sultanov.cfttestproject.domain.item.ResultUser
import kotlinx.coroutines.flow.Flow

interface RandomUserRepository {

    fun getName() : Flow<List<ResultUser>>
}