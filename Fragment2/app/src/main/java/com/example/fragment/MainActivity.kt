package com.example.fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber = findViewById<EditText>(R.id.etNumber)
        val btnShow = findViewById<Button>(R.id.btnShow)

        btnShow.setOnClickListener {
            val input = etNumber.text.toString()
            if (input.isNotEmpty()) {
                val count = input.toInt()
                showFragment(BlankFragment.newInstance(count))

            }
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}