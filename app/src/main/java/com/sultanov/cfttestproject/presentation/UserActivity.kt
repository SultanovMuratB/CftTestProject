package com.sultanov.cfttestproject.presentation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sultanov.cfttestproject.R
import com.sultanov.cfttestproject.data.users.domain.entity.User

internal class UserActivity : AppCompatActivity(R.layout.activity_user) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val user = intent.getParcelableExtra<User>(EXTRA_USER_VALUE)
        val titleUserName: TextView = findViewById(R.id.title_name_user)
        val firstUserName: TextView = findViewById(R.id.first_name_user)
        val lastUserName: TextView = findViewById(R.id.last_name_user)
        val genderUser: TextView = findViewById(R.id.gender_user)
        val emailUser: TextView = findViewById(R.id.email_user)
        val phoneUser: TextView = findViewById(R.id.phone_user)
        val cellUser: TextView = findViewById(R.id.cell_user)
        val dobUser: TextView = findViewById(R.id.dob_user)
        val ageUser: TextView = findViewById(R.id.age_user)
        val cityUser: TextView = findViewById(R.id.city_user)
        val stateUser: TextView = findViewById(R.id.state_user)
        val countryUser: TextView = findViewById(R.id.country_user)
        val postcodeUser: TextView = findViewById(R.id.postcode_user)

        titleUserName.text = user?.name?.title
        firstUserName.text = user?.name?.first
        lastUserName.text = user?.name?.last
        genderUser.text = user?.gender
        emailUser.text = user?.email
        emailUser.setOnClickListener {
            (emailUser.text as String?)?.let { it1 -> getEmailClick(it1) }
        }
        phoneUser.text = user?.phone
        cellUser.text = user?.cell
        dobUser.text = user?.dob?.date
        ageUser.text = user?.dob?.age
        cityUser.text = user?.location?.city
        stateUser.text = user?.location?.state
        countryUser.text = user?.location?.country
        postcodeUser.text = user?.location?.postcode
    }

    private fun getEmailClick(message: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse(message)
        }
        startActivity(intent)
    }

    companion object {

        private const val EXTRA_USER_VALUE = "extra_user"

        fun newIntent(context: Context, user: User) : Intent {
            val intent = Intent(context, UserActivity::class.java)
            intent.putExtra(EXTRA_USER_VALUE, user)
            return intent
        }
    }
}