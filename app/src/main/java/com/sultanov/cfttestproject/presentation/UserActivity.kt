package com.sultanov.cfttestproject.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sultanov.cfttestproject.R
import com.sultanov.cfttestproject.data.users.domain.User

internal class UserActivity : AppCompatActivity(R.layout.activity_user) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val result = intent.extras
        val user = result?.getSerializable(User::class.java.simpleName)
        val titleUserName: TextView = findViewById(R.id.title_name_text_view)
        titleUserName.text = user
    }


    companion object {

        private const val EXTRA_USER_VALUE = "extra_user"

        fun newIntent(context: Context, user: User) : Intent {
            val intent = Intent(context, UserActivity::class.java)
            intent.putExtra(User::class.java.simpleName, user)
            return intent
        }
    }


}