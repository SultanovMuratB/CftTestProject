package com.sultanov.cfttestproject.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.flowWithLifecycle
import com.sultanov.cfttestproject.R
import com.sultanov.cfttestproject.data.users.domain.User
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels {
        MainViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.usersFlow.flowWithLifecycle(lifecycle)
            .onEach(::doOnGetUsers)
            .launchIn(lifecycle.coroutineScope)
    }

    private fun doOnGetUsers(users: List<User>) {

    }
}
