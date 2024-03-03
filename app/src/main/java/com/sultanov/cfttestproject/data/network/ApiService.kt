package com.sultanov.cfttestproject.data.network

import com.sultanov.cfttestproject.data.dto.UserResponseDTO
import retrofit2.http.GET

interface ApiService {

    @GET("api")
    suspend fun getName() : UserResponseDTO
}