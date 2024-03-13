package com.sultanov.cfttestproject.presentation.userListScreen

import androidx.recyclerview.widget.DiffUtil
import com.sultanov.cfttestproject.data.users.domain.entity.User
import javax.inject.Inject

internal class UserDiffCallback : DiffUtil.ItemCallback<User>() {

    override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
        return oldItem == newItem
    }
}
