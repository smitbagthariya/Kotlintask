package com.example.cravebox

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class loginpage : AppCompatActivity() {
    lateinit var edt1: EditText
    lateinit var edt2: EditText
    lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener {

            var name = edt1.text.toString()
            var pass = edt2.text.toString()

            if (name.length == 0 && pass.length == 0) {
                edt1.setError("Please Enter Name")
                edt2.setError("Please Enter Password")
            } else if (name.length == 0) {
                edt1.setError("Please Enter Name")
            } else if (pass.length == 0) {
                edt2.setError("Please Enter Password")
            } else {
                if (name.equals("tops") && pass.equals("1234")) {
                    Toast.makeText(applicationContext, "success", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT)
                        .show()
                }

            }


        }

    }

    override fun onBackPressed() {

        var alert = AlertDialog.Builder(this)
        alert.setTitle("Are you sure you want to exits")
        alert.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            finishAffinity()
        })
        alert.setNeutralButton("No", { dialogInterface: DialogInterface, i: Int ->
            dialogInterface.cancel()
        })
        alert.show()

//        super.onBackPressed()
    }


}