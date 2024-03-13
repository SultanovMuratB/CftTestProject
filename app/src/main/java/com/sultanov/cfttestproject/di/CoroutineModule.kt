package com.sultanov.cfttestproject.di

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher

@Module
internal class CoroutineModule(private val dispatcher: CoroutineDispatcher) {

    @Provides
    fun provideCoroutineModule() : CoroutineDispatcher {
        return dispatcher
    }
}