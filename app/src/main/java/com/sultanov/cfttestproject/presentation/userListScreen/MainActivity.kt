package com.sultanov.cfttestproject.presentation.userListScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.RecyclerView
import com.sultanov.cfttestproject.R
import com.sultanov.cfttestproject.data.users.domain.entity.User
import com.sultanov.cfttestproject.di.CoroutineModule
import com.sultanov.cfttestproject.di.DaggerAppComponent
import com.sultanov.cfttestproject.presentation.userScreen.UserActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class MainActivity : AppCompatActivity(R.layout.activity_main) {

//    private val viewModel: MainViewModel by viewModels {
//        MainViewModel.Factory
//    }

    @Inject
    lateinit var viewModelFactory: MainViewModuleFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
    }

    private lateinit var adapter: UserAdapter

    private val component = DaggerAppComponent.builder()
        .coroutineModule(CoroutineModule(Dispatchers.IO))
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupRecyclerView()
        component.inject(this)
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.usersFlow.collect { users ->
                    doOnGetUsers(users)
                }
            }
        }
    }

    private fun doOnGetUsers(users: List<User>) {
        adapter.submitList(users)
    }

    private fun setupRecyclerView() {
        val rvUserList = findViewById<RecyclerView>(R.id.rv_random_user)
        adapter = UserAdapter()
        rvUserList.adapter = adapter
        adapter.onUserOnClickListener = {
            val intent = UserActivity.newIntent(this, it)
            startActivity(intent)
        }
    }
}

