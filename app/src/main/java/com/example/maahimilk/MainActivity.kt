package com.example.maahimilk

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.daimajia.slider.library.SliderLayout
import com.daimajia.slider.library.SliderTypes.TextSliderView


class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var listView: GridView
    lateinit var list: MutableList<Model>
    lateinit var sliderLayout: SliderLayout
    var map = HashMap<String,Int>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list)
        list = ArrayList()
        var toolbar: Toolbar = findViewById(R.id.toolbar)

        sliderLayout = findViewById(R.id.slider)
        map.put("one", R.drawable.img_19)
        map.put("two", R.drawable.img_20)
        map.put("three", R.drawable.img_21)
        map.put("three", R.drawable.img_22)


        for(i in map.keys)
        {
            var txtslider = TextSliderView(this)

            txtslider.image(map.get(i)!!)

            sliderLayout.addSlider(txtslider)

        }



        setSupportActionBar(toolbar)
        supportActionBar?.title = "Home"


        list.add(Model(R.drawable.img_5, "SHRIKHAND KESAR 100 GM", "RS. 35.0", "SUBSCRIBE @ ₹35.0", "1"))
        list.add(Model(R.drawable.img_6, "SHRIKHAND KESAR 500 GM", "RS. 140.0", "SUBSCRIBE @ ₹140.0", "1"))
        list.add(Model(R.drawable.img_7, "SHRIKHAND ILAICHI 100 GM", "RS. 30.0", "SUBSCRIBE @ ₹30.0", "1"))
        list.add(Model(R.drawable.img_8, "SHRIKHAND ILAICHI 500 GM", "RS. 130.0", "SUBSCRIBE @ ₹130.0", "1"))
        list.add(Model(R.drawable.img_9, "GIR DHARA PREMIUM COW MILK", "RS. 70.0", "SUBSCRIBE @ ₹70.0", "1"))
        list.add(Model(R.drawable.img_10, "MASALA CHACH 190 ML", "RS. 15.0", "SUBSCRIBE @ ₹15.0", "1"))



        var adapter = HomeAdapter(this, list)
        listView.adapter = adapter


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            return  return when (item.itemId) {
                R.id.menu -> {
                    true
                }

                else -> super.onOptionsItemSelected(item)

        }




    }
}