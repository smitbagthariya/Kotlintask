package com.example.maahimilk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplaceScreen : AppCompatActivity() {
    
    lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splace_screen)

            btn1 = findViewById(R.id.btn1)

            btn1.setOnClickListener {

                var i = Intent(this, MainActivity::class.java)
                startActivity(i)

            }


    }
}