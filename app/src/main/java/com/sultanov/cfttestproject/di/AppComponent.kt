package com.sultanov.cfttestproject.di

import com.sultanov.cfttestproject.presentation.userListScreen.MainActivity
import dagger.Component

@ApplicationScope
@Component(modules = [
    DataModule::class,
    DomainModule::class,
    CoroutineModule::class,
    ViewModelModule::class
])
internal interface AppComponent {

    fun inject(activity: MainActivity)
}