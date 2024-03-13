package com.sultanov.cfttestproject.presentation.userListScreen

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sultanov.cfttestproject.R
import javax.inject.Inject

internal class UserViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val userName: TextView = view.findViewById(R.id.user_name)
    val userEmail: TextView = view.findViewById(R.id.user_email)
    val userPhone: TextView = view.findViewById(R.id.user_phone)
}