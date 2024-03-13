package com.sultanov.cfttestproject.di

import androidx.lifecycle.ViewModel
import com.sultanov.cfttestproject.presentation.userListScreen.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
internal interface ViewModelModule {

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindViewModel(impl: MainViewModel) : ViewModel
}