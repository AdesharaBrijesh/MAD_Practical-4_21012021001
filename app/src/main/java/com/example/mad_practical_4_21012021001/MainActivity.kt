package com.example.mad_practical_4_21012021001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Login: Button = findViewById(R.id.Login)
        val Signup: Button = findViewById(R.id.Signup)


        Login.setOnClickListener {
            Intent(this@MainActivity, LoginActivity::class.java).also { startActivity(it) }
        }

        Signup.setOnClickListener {
            Intent(this@MainActivity, RegistrationActivity::class.java).also { startActivity(it) }
        }

    }
}