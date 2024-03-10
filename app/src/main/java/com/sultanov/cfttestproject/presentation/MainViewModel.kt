package com.sultanov.cfttestproject.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.sultanov.cfttestproject.data.users.data.RandomUserRepositoryImpl
import com.sultanov.cfttestproject.data.users.data.UsersMapperImpl
import com.sultanov.cfttestproject.data.users.data.UsersServiceApi
import com.sultanov.cfttestproject.data.users.domain.GetUsersUseCase
import com.sultanov.cfttestproject.data.users.domain.GetUsersUseCaseImpl
import com.sultanov.cfttestproject.data.users.domain.User
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

internal class MainViewModel(
    private val getUsersUseCase: GetUsersUseCase,
    private val ioDispatcher: CoroutineDispatcher,
) : ViewModel() {

    private val usersMutableFlow = MutableStateFlow<List<User>>(listOf())
    val usersFlow = usersMutableFlow.asStateFlow()

    init {
        viewModelScope.launch(ioDispatcher) {
            usersMutableFlow.value = getUsersUseCase.getUsers()
        }

    }

    companion object {

        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                MainViewModel(
                    getUsersUseCase = GetUsersUseCaseImpl(
                        randomUserRepository = RandomUserRepositoryImpl(
                            usersServiceApi = UsersServiceApi.newInstance(),
                            usersMapper = UsersMapperImpl(),
                        ),
                    ),
                    ioDispatcher = Dispatchers.IO,
                )
            }
        }
    }
}
