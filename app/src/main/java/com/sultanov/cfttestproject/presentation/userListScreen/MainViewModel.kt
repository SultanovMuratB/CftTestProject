package com.sultanov.cfttestproject.presentation.userListScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sultanov.cfttestproject.data.users.domain.GetUsersUseCase
import com.sultanov.cfttestproject.data.users.domain.entity.User
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class MainViewModel @Inject constructor(
    private val getUsersUseCase: GetUsersUseCase,
    ioDispatcher: CoroutineDispatcher,
) : ViewModel() {

    private val usersMutableFlow = MutableStateFlow<List<User>>(listOf())
    val usersFlow = usersMutableFlow.asStateFlow()

    init {
        viewModelScope.launch(ioDispatcher) {
            usersMutableFlow.value = getUsersUseCase.getUsers()
        }
    }

//    companion object {
//
//        val Factory: ViewModelProvider.Factory = viewModelFactory {
//            initializer {
//                MainViewModel (
//                    getUsersUseCase = GetUsersUseCaseImpl (
//                        randomUserRepository = RandomUserRepositoryImpl(
//                            usersServiceApi = UsersServiceApi.newInstance(),
//                            usersMapper = UsersMapperImpl(),
//                        ),
//                    ),
//                    ioDispatcher = Dispatchers.IO,
//                )
//            }
//        }
//    }
}
