package com.example.customlist


import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity()
{
    lateinit var listView: ListView
    lateinit var list:MutableList<Model>
    lateinit var toolbar: Toolbar
    lateinit var image: Image
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        listView = findViewById(R.id.list)

        list = ArrayList()

        //set data
        list.add(Model(R.drawable.img1,"iphon 13 pro max(1TB)","1,79,900"))
        list.add(Model(R.drawable.img2,"iphone 14 pro max(1TB)","1,84,900"))
        list.add(Model(R.drawable.img3,"iphone 15 pro max(1TB)","1,54,900"))
        list.add(Model(R.drawable.img4,"iphone 16 pro max(1TB)","1,84,900"))
        list.add(Model(R.drawable.img5,"Samsung s21 Ultra(256 GB)","1,28,999"))
        list.add(Model(R.drawable.img6,"Samsung s22 Ultra(1TB)","1,25,999"))
        list.add(Model(R.drawable.img7,"Samsung s23 Ultra(1TB)","1,56,999"))
        list.add(Model(R.drawable.img8,"Samsung s24 Ultra(1TB)","1,51,999"))


        var adapter = MyAdapter(applicationContext,list)
        listView.adapter=adapter



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.item1->
            {
                Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.item2->
            {
                Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}