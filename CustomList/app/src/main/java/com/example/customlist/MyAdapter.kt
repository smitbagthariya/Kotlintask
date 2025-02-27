package com.example.customlist

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var context: Context, var list: MutableList<ColorSpace.Model>) : BaseAdapter()
{
    override fun getCount(): Int
    {
        return list.size
    }

    override fun getItem(position: Int): Any
    {
        return list.get(position)
    }

    override fun getItemId(position: Int): Long
    {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        var layout = LayoutInflater.from(context)
        var view = layout.inflate(R.layout.design)

        var txt1:TextView = view.findViewById(R.id.txt1)
        var txt2: TextView = view.findViewById(R.id.txt2)
        var image : ImageView = view.findViewById(R.id.img)

        //get data
        txt1.setText(list.get(position).title)
        txt2.setText(list.get(position).subtitle)
        image.setImageResource(list.get(position).image)


        return view
    }

    }