package com.example.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondtask : AppCompatActivity()
{
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondtask)
        val toastImageButton = findViewById<ImageButton>(R.id.img1)
        toastImageButton.setOnClickListener()
        {
            Toast.makeText(applicationContext, "Clicked pizza", Toast.LENGTH_SHORT).show()
        }

    }
}
