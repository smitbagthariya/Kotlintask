package com.example.assessment1

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.assessment1.databinding.ActivityDashboardBinding

class dashboard : AppCompatActivity() {
    lateinit var binding: ActivityDashboardBinding
    private lateinit var sharedPreferences: SharedPreferences
    lateinit var gridView: GridView
    lateinit var list: MutableList<Model>
    lateinit var adapter: GridAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        if (!sharedPreferences.getBoolean("isLoggedIn", false)) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        list = mutableListOf(
            Model(R.drawable.img, "Start Quiz"),
            Model(R.drawable.img_1, "Read Questions")
        )

        adapter = GridAdapter(this, list)
        gridView = binding.dashboardGrid
        gridView.adapter = adapter

        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> Toast.makeText(this, "Play Quiz clicked", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Read Questions clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.dashboardmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.aboutus -> {
                Toast.makeText(this, "About Us clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.contactus -> {
                Toast.makeText(this, "Contact Us clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.logout -> {
                sharedPreferences.edit().putBoolean("isLoggedIn", false).apply()
                Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
