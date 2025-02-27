package com.example.assessment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    lateinit var text: TextView
    lateinit var text2: TextView
    lateinit var card: androidx.cardview.widget.CardView
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var forgot: TextView
    lateinit var login: Button
    lateinit var signup: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.ecorp_text)
        text2 = findViewById(R.id.ecorp_text2)
        card = findViewById(R.id.card)
        email = findViewById(R.id.email_input)
        password = findViewById(R.id.password_input)
        forgot = findViewById(R.id.forgot_password)
        login = findViewById(R.id.login_button)
        signup = findViewById(R.id.signup_button)

        signup.setOnClickListener {

            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

    }
}