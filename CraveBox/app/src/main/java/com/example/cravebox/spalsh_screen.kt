package com.example.cravebox

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class spalsh_screen : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalshwithamin)

        Handler().postDelayed(Runnable {

            var i = Intent(applicationContext,loginpage::class.java)
            startActivity(i)

        },2000)

    }
}