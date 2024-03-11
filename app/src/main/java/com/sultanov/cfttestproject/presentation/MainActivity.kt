package com.sultanov.cfttestproject.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.RecyclerView
import com.sultanov.cfttestproject.R
import com.sultanov.cfttestproject.data.users.domain.entity.User
import com.sultanov.cfttestproject.presentation.recyclerView.UserAdapter
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels {
        MainViewModel.Factory
    }
    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupRecyclerView()
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

