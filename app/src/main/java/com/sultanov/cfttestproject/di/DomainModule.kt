package com.sultanov.cfttestproject.di

import com.sultanov.cfttestproject.data.users.data.RandomUserRepositoryImpl
import com.sultanov.cfttestproject.data.users.domain.GetUsersUseCase
import com.sultanov.cfttestproject.data.users.domain.GetUsersUseCaseImpl
import com.sultanov.cfttestproject.data.users.domain.RandomUserRepository
import dagger.Binds
import dagger.Module

@Module
internal interface DomainModule {

    @Binds
    fun bindRepository(impl: RandomUserRepositoryImpl) : RandomUserRepository

    @Binds
    fun bindUseCase(impl: GetUsersUseCaseImpl) : GetUsersUseCase
}