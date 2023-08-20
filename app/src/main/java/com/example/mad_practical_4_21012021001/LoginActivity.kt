package com.example.mad_practical_4_21012021001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mad_practical_4_21012021001.R.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_login)
        val Signup: Button = findViewById(R.id.Signupbtn)

        Signup.setOnClickListener {
            Intent(this@LoginActivity, RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}