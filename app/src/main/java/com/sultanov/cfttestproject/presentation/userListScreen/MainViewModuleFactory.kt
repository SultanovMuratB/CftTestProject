package com.sultanov.cfttestproject.presentation.userListScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sultanov.cfttestproject.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

@ApplicationScope
internal class MainViewModuleFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass]?.get() as T
    }
}