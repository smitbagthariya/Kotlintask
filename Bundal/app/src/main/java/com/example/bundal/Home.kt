package com.example.bundal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Home : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val button = view.findViewById<Button>(R.id.home_fragment)

        button.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("message", "Hello from Home")
            findNavController().navigate(R.id.action_navigation_home_to_navigation_profile, bundle)
        }
        return view
    }
}