package com.example.database1

import DbHelper
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UpdateActivity : AppCompatActivity()
{
    lateinit var edt1:EditText
    lateinit var edt2: EditText
    lateinit var btnUpdate: Button
    lateinit var dbHelper: DbHelper
    var id:Int=0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)

        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btnUpdate = findViewById(R.id.btnUpdate)
        dbHelper = DbHelper(applicationContext)

        var i = intent
        id = i.getIntExtra("id",101)
        edt1.setText(i.getStringExtra("name"))
        edt2.setText(i.getStringExtra("num"))


        btnUpdate.setOnClickListener {

            var name = edt1.text.toString()
            var num = edt2.text.toString()

            var m = Model()
            m.id = id
            m.name = name
            m.num = num

            dbHelper.updatedata(m)
            Toast.makeText(applicationContext, "RECORD UPDATED", Toast.LENGTH_SHORT).show()
            startActivity(Intent(applicationContext,ViewActivity::class.java))
        }
    }
}