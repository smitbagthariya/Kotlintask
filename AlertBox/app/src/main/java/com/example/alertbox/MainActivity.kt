package com.example.alertbox

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_SHORT).show()

            // Use the activity context to inflate the layout
            val layoutInflater = LayoutInflater.from(this)
            val customView = layoutInflater.inflate(R.layout.activity_design, null)

            // Build the AlertDialog with a custom theme
            val alert = AlertDialog.Builder(this, R.style.CustomAlertDialogTheme)
                .setView(customView)
                .create()

            // Show the AlertDialog
            alert.show()

            // Adjust dialog size (optional)
            val window = alert.window
            window?.setLayout(
                (resources.displayMetrics.widthPixels * 0.9).toInt(), // 90% of screen width
                WindowManager.LayoutParams.WRAP_CONTENT
            )
        }
    }
}