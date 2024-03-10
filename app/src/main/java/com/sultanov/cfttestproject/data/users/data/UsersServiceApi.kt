package com.sultanov.cfttestproject.data.users.data

import androidx.annotation.WorkerThread
import com.sultanov.cfttestproject.data.users.data.dto.GetUsersResponseDto
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

internal interface UsersServiceApi {

    @GET("/api/?results=25")
    @WorkerThread
    suspend fun getUsers(): GetUsersResponseDto

    companion object {
        private const val BASE_URL = "https://randomuser.me"

        fun newInstance(): UsersServiceApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create()
        }
    }
}
