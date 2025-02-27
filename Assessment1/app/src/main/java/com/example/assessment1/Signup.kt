package com.example.assessment1

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.assessment1.databinding.ActivitySignupBinding
import com.example.assessment1.viewmodel.com.example.assessment1.MyDbClass
import com.example.assessment1.viewmodel.com.example.assessment1.User

class Signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            try {
                val firstName = binding.etd1.text.toString()
                val lastName = binding.edt2.text.toString()
                val email = binding.edt3.text.toString()
                val password = binding.edt4.text.toString()
                val confirmPassword = binding.edt5.text.toString()

                // Validate input
                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(this, "Invalid email format", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                if (password != confirmPassword) {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val user = User(email, firstName, lastName, password)

                // Insert user in the database on a background thread
                Thread {
                    MyDbClass.getDatabase(this).MyDao().insertUser(user)
                    runOnUiThread {
                        Toast.makeText(this, "User added successfully!", Toast.LENGTH_SHORT).show()
                    }
                }.start()


            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "An error occurred: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }

    }
}
