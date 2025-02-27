package com.example.customlist

import android.graphics.ColorSpace.Model
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    lateinit var listView: ListView
    lateinit var list: MutableList<Model>
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list)
        list = ArrayList()

        list.add(R.drawable.img1)
        list.add(R.drawable.img2)

        var adapter = MyAdapter(applicationContext,list)
        listView.adapter=adapter
    }
}