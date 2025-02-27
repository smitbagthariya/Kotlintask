package com.example.fragment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    lateinit var linearLayout: LinearLayout
    lateinit var editText: EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(R.layout.activity_main)

    }

    private fun enableEdgeToEdge(statusBarStyle: Int) {

    }
}