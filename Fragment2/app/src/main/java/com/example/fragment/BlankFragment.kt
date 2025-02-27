package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    companion object {
        private const val ARG_COUNT = "button_count"

        fun newInstance(count: Int): BlankFragment {
            val fragment = BlankFragment()
            val args = Bundle()
            args.putInt(ARG_COUNT, count)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val btnContainer = view.findViewById<LinearLayout>(R.id.btnContainer)

        val count = arguments?.getInt(ARG_COUNT) ?: 0
        for (i in 1..count) {
            val button = Button(requireContext())
            button.text = "Button $i"
            button.setOnClickListener {
                Toast.makeText(requireContext(), "Clicked Button $i", Toast.LENGTH_SHORT).show()
            }
            btnContainer.addView(button)
        }

        return view
    }
}