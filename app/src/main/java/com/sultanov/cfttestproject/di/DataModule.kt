package com.sultanov.cfttestproject.di

import com.sultanov.cfttestproject.data.users.data.UsersServiceApi
import dagger.Module
import dagger.Provides

@Module
internal interface DataModule {


    companion object {
        @Provides
        fun provideServiceApi() : UsersServiceApi {
            return UsersServiceApi.newInstance()
        }
    }
}