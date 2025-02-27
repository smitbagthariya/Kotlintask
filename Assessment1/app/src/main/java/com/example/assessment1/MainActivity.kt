package com.example.assessment1

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.assessment1.databinding.ActivityMainBinding
import com.example.assessment1.viewmodel.com.example.assessment1.MyDbClass

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)
        if (isLoggedIn) {
            startActivity(Intent(this, dashboard::class.java))
            finish()
        }

        binding.btn1.setOnClickListener {
            try {
                val email = binding.edt1.text.toString()
                val password = binding.edt2.text.toString()

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val user = MyDbClass.getDatabase(this).MyDao().getUser(email,password)
                if (user != null && user.password == password) {
                    sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
                    startActivity(Intent(this, dashboard::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "An error occurred: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }


        binding.btn2.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }
    }
}
