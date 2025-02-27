package com.example.amul

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Logout : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_logout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        showLogoutDialog()
    }

    private fun showLogoutDialog() {
        val alert = AlertDialog.Builder(requireContext())
        alert.setTitle("Logout")
        alert.setMessage("Are you sure you want to log out?")
        alert.setPositiveButton("YES") { _, _ ->

            performLogout()
        }
        alert.setNegativeButton("NO") { dialog, _ ->

            dialog.dismiss()
        }
        alert.show()
    }

    private fun performLogout() {

        val intent = Intent(requireContext(), Login_form::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}
