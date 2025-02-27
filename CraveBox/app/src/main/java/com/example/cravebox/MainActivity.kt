package com.example.cravebox

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i : ImageView = findViewById(R.id.pizza)

        i.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }

        val text = findViewById<TextView>(R.id.text2)
        text.setOnClickListener {
            val url = "https://lapinozpizza.in/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        val callbutton = findViewById<Button>(R.id.callbutton)

        callbutton.setOnClickListener {
            val phoneNumber = " " // Replace with your desired phone number
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        val vadapav = findViewById<ImageView>(R.id.vadapav)

        vadapav.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }

        val text2 = findViewById<TextView>(R.id.text3)
        text2.setOnClickListener {
            val url = "https://www.swiggy.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }


        val sandwich = findViewById<ImageView>(R.id.sandwich)

        sandwich.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity4::class.java)
            startActivity(intent)
        }

        val text3 = findViewById<TextView>(R.id.text4)
        text3.setOnClickListener {
            val url = "https://www.zomato.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        val burger = findViewById<ImageView>(R.id.burger)

        burger.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity5::class.java)
            startActivity(intent)
        }

        val text4 = findViewById<TextView>(R.id.text5)
        text4.setOnClickListener {
            val url = "https://www.swiggy.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }


        val puff = findViewById<ImageView>(R.id.puff)

        puff.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity6::class.java)
            startActivity(intent)
        }

        val text5 = findViewById<TextView>(R.id.text6)
        text5.setOnClickListener {
            val url = "https://www.zomato.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        val manchurian = findViewById<ImageView>(R.id.manchurian)

        manchurian.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity7::class.java)
            startActivity(intent)
        }

        val text6 = findViewById<TextView>(R.id.text7)
        text6.setOnClickListener {
            val url = "https://www.swiggy.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        val roll = findViewById<ImageView>(R.id.roll)

        roll.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity8::class.java)
            startActivity(intent)
        }

        val text7 = findViewById<TextView>(R.id.text8)
        text7.setOnClickListener {
            val url = "https://www.zomato.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        val dosa = findViewById<ImageView>(R.id.dosa)

        dosa.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity9::class.java)
            startActivity(intent)
        }

        val text8 = findViewById<TextView>(R.id.text9)
        text8.setOnClickListener {
            val url = "https://www.swiggy.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        val Idli = findViewById<ImageView>(R.id.idli)

        Idli.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity10::class.java)
            startActivity(intent)
        }

        val text9 = findViewById<TextView>(R.id.text10)
        text9.setOnClickListener {
            val url = "https://www.zomato.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        val pavbhaji = findViewById<ImageView>(R.id.pavbhaji)

        pavbhaji.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity11::class.java)
            startActivity(intent)
        }


        val text10 = findViewById<TextView>(R.id.text11)

        text10.setOnClickListener {
            val url = "https://www.swiggy.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

    }

}