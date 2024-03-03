package com.sultanov.cfttestproject.domain

import com.sultanov.cfttestproject.domain.item.ResultUser
import kotlinx.coroutines.flow.Flow

class GetListUserUseCase(private val randomUserRepository: RandomUserRepository) {

    fun getName(): Flow<List<ResultUser>> {
        return randomUserRepository.getName()
    }
}