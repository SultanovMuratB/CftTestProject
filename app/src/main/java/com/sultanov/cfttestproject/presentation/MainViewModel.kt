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
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

internal class MainViewModel(
    private val getUsersUseCase: GetUsersUseCase,
    private val ioDispatcher: CoroutineDispatcher,
) : ViewModel() {

    private val usersMutableFlow = MutableStateFlow<List<User>>(listOf())
    val usersFlow: StateFlow<List<User>> = usersMutableFlow

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


/*
companion object {

        fun createFactory(): ViewModelProvider.Factory {
            return viewModelFactory {
                initializer {
                    val savedStateHandle = createSavedStateHandle()
                    val screenInputs = savedStateHandle.getScreenInputsOrThrow()
                    val app = getApplication()
                    val component = ServiceLocator.getComponent(app)

                    val canCloseScreenInteractor = component.createCanCloseScreenInteractor(
                        cancellationRule = screenInputs.cancellationRule,
                    )

                    val needCloseScreenOnErrorInteractor = component.createNeedCloseScreenOnErrorInteractor(
                        cancellationRule = screenInputs.cancellationRule,
                    )

                    val analyticsInteractor = component.createAnalyticsInteractor(
                        paywallId = screenInputs.paywallId,
                        analyticsParams = screenInputs.analyticsParams,
                        canCloseScreenInteractor = canCloseScreenInteractor,
                    )

                    MainViewModel(
                        compatJsInterface = component.compatJsInterface,
                        deserializeInMessageInteractor = component.deserializeInMessageInteractor,
                        webDiagnostic = component.webDiagnostic,
                        webAnalytics = component.createWebAnalytics(analyticsInteractor),
                        screenInputs = screenInputs,
                        componentDependencies = component.dependencies,
                        urlLauncher = component.urlLauncher,
                        authLauncher = component.authLauncher,
                        getScreenContentInteractor = component.createGetScreenContentInteractor(
                            analyticsInteractor = analyticsInteractor,
                            mobileQuickStartParams = screenInputs.mobileQuickStartParams,
                        ),
                        canCloseScreenInteractor = canCloseScreenInteractor,
                        needCloseScreenOnErrorInteractor = needCloseScreenOnErrorInteractor,
                        paymentInteractor = component.paymentInteractor,
                        accountStateFlow = component.accountStateFlow,
                        analyticsInteractor = analyticsInteractor,
                        screenDiagnostic = component.screenDiagnostic,
                        requestHeadersProvider = component.requestHeadersProvider,
                        ioDispatcher = component.dispatchersProvider.ioDispatcher,
                    )
                }
            }
        }
    }
 */
