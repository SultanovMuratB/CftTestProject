package com.sultanov.cfttestproject.presentation.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sultanov.cfttestproject.R
import com.sultanov.cfttestproject.data.users.domain.User

internal class UserAdapter : ListAdapter<User, UserAdapter.UserViewHolder>(UserDiffCallback()) {

    var onUserOnClickListener: ((User) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = getItem(position)
        holder.itemView.setOnClickListener {
            onUserOnClickListener?.invoke(user)
        }
        val fullName = user.name.title.toString() + " " + user.name.first.toString() + " " + user.name.last.toString()
        holder.userName.text = fullName
        holder.userEmail.text = user.email
        holder.userPhone.text = user.phone
    }

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userName: TextView = view.findViewById(R.id.user_name)
        val userEmail: TextView = view.findViewById(R.id.user_email)
        val userPhone: TextView = view.findViewById(R.id.user_phone)
    }
}