package com.example.amul

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val proceedButton = findViewById<Button>(R.id.btn1)

        val blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink)

        proceedButton.startAnimation(blinkAnimation)

        proceedButton.setOnClickListener{
            val intent = Intent(this, Login_form::class.java)
            startActivity(intent)
            proceedButton.clearAnimation()

        }
    }
}
