@file:Suppress("DEPRECATION")

package com.example.amul

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import com.daimajia.slider.library.SliderLayout
import com.daimajia.slider.library.SliderTypes.TextSliderView

class Home : Fragment() {

    private lateinit var listView: GridView
    private lateinit var list: MutableList<Model>
    private lateinit var sliderLayout: SliderLayout
    private val map = HashMap<String, Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        try {

            val view = inflater.inflate(R.layout.fragment_home, container, false)

            listView = view.findViewById(R.id.list)
            list = ArrayList()

            sliderLayout = view.findViewById(R.id.slider)
            map["one"] = R.drawable.img_19
            map["two"] = R.drawable.img_20
            map["three"] = R.drawable.img_21
            map["four"] = R.drawable.img_22

            for (key in map.keys) {
                val txtslider = TextSliderView(requireContext())
                txtslider.image(map[key]!!)
                sliderLayout.addSlider(txtslider)
            }

            list.add(
                Model(
                    R.drawable.img_5,
                    "SHRIKHAND KESAR 100 GM",
                    "RS. 35.0",
                    "SUBSCRIBE @ ₹35.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_6,
                    "SHRIKHAND KESAR 500 GM",
                    "RS. 140.0",
                    "SUBSCRIBE @ ₹140.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_7,
                    "SHRIKHAND ILAICHI 100 GM",
                    "RS. 30.0",
                    "SUBSCRIBE @ ₹30.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_8,
                    "SHRIKHAND ILAICHI 500 GM",
                    "RS. 130.0",
                    "SUBSCRIBE @ ₹130.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_9,
                    "GIR DHARA PREMIUM COW MILK",
                    "RS. 70.0",
                    "SUBSCRIBE @ ₹70.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_10,
                    "MASALA CHACH 190 ML",
                    "RS. 15.0",
                    "SUBSCRIBE @ ₹15.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_11,
                    "LASSI 180 ML TETRA PAK",
                    "RS. 20.0",
                    "SUBSCRIBE @ ₹20.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_14,
                    "BUTTER 100 GMS",
                    "RS. 60.0",
                    "SUBSCRIBE @ ₹60.0",
                    "1"
                )
            )
            list.add(
                Model(
                    R.drawable.img_15,
                    "CJEESE CUBES 180GM",
                    "RS. 135.0",
                    "SUBSCRIBE @ ₹135.0",
                    "1"
                )
            )

            val adapter = HomeAdapter(requireContext(), list)
            listView.adapter = adapter

            setHasOptionsMenu(true)

            return view

        }
        catch (e: Exception)
        {
            e.printStackTrace()

            return View(context)
        }
    }
}
