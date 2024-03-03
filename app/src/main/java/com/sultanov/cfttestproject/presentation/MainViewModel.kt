package com.sultanov.cfttestproject.presentation

import androidx.lifecycle.ViewModel
import com.sultanov.cfttestproject.data.repository.RandomUserRepositoryImpl
import com.sultanov.cfttestproject.domain.GetListUserUseCase

class MainViewModel : ViewModel() {

    private val repository = RandomUserRepositoryImpl()
    private val getListUserUseCase = GetListUserUseCase(repository)

    val user = getListUserUseCase.getName()
}
