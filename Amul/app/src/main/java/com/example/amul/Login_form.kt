package com.example.amul

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login_form : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var edt1: EditText
    private lateinit var edt2: EditText

    private val sharedPrefFile = "loginSharedPref"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)

        button = findViewById(R.id.btn1)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)

        val sharedPreferences = getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)

        if(sharedPreferences.getBoolean("MYSESSION",false) && !sharedPreferences.getString("n1","")!!.isEmpty())
        {
            var i = Intent(applicationContext,MainActivity::class.java)
            startActivity(i)
            finish()
        }


        button.setOnClickListener {
            val name = edt1.text.toString()
            val pass = edt2.text.toString()

            when {
                name.isEmpty() -> edt1.error = "Please Enter Name"
                pass.isEmpty() -> edt2.error = "Please Enter Password"
                name == "smit" && pass == "1234" -> {

                    val editor = sharedPreferences.edit()
                    var i = Intent(applicationContext,MainActivity::class.java)
                    editor.putBoolean("isLoggedIn", true)
                    editor.putString("username", name)
                    editor.putString("password", pass)
                    editor.apply()
                    startActivity(i)

                    Toast.makeText(applicationContext, "Login successful", Toast.LENGTH_SHORT).show()

                }
                else -> {
                    Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
