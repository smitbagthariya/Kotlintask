package com.example.amul

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class HomeAdapter(var context: Context, var list:MutableList<Model>) : BaseAdapter()
{
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override  fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var layout = LayoutInflater.from(context)
        var view = layout.inflate(R.layout.design, p2, false)




        var title: TextView = view.findViewById(R.id.title)
        var price: TextView = view.findViewById(R.id.price)
        var subscriptionText: TextView = view.findViewById(R.id.subscriptionText)
        var quantity: TextView = view.findViewById(R.id.quantity)
        var image: ImageView = view.findViewById(R.id.image)


        title.setText(list.get(p0).title1)
        price.setText(list.get(p0).price1)
        subscriptionText.setText(list.get(p0).sub1)
        quantity.setText(list.get(p0).quntity1)
        image.setImageResource(list.get(p0).image1)




        return view



    }


}
