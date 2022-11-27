package com.musshal.restaurantapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
  private lateinit var rvRestaurants: RecyclerView
  private var list: ArrayList<Restaurant> = arrayListOf()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    rvRestaurants = findViewById(R.id.rv_restaurants)
    rvRestaurants.setHasFixedSize(true)

    list.addAll(RestaurantsData.listData)
    showRecyclerList()
  }

  private fun showRecyclerList() {
    rvRestaurants.layoutManager = LinearLayoutManager(this)
    val listRestaurantAdapter = ListRestaurantAdapter(list)
    rvRestaurants.adapter = listRestaurantAdapter
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.menu_about, menu)
    return super.onCreateOptionsMenu(menu)
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val intent = Intent(this, AboutActivity::class.java)
    startActivity(intent)
    return super.onOptionsItemSelected(item)
  }
}