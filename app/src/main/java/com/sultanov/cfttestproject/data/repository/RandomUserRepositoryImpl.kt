package com.sultanov.cfttestproject.data.repository

import com.sultanov.cfttestproject.data.mapper.ResultUserMapper
import com.sultanov.cfttestproject.data.network.RetrofitClient
import com.sultanov.cfttestproject.domain.RandomUserRepository
import kotlinx.coroutines.flow.flow

class RandomUserRepositoryImpl : RandomUserRepository {

    private val retrofitClient = RetrofitClient
    private val mapper = ResultUserMapper()

    override fun getName() = flow {
        emit(mapper.mapListResultUserDtoToListResultUser(retrofitClient.apiService.getName()))
    }
}