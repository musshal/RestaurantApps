package com.musshal.restaurantapps

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar

class DetailRestaurantActivity : AppCompatActivity() {
  companion object {
    const val KEY_RESTAURANT = "key_restaurant"
  }

  @SuppressLint("MissingInflatedId")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail_restaurant)


    supportActionBar!!.title = "Restaurant Detail"
    supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    val dataRestaurant = intent.getParcelableExtra(KEY_RESTAURANT) as Restaurant?

    if (dataRestaurant != null) {
      findViewById<ImageView>(R.id.img_item_picture).setImageResource(dataRestaurant.picture)
    }

    findViewById<TextView>(R.id.tv_item_name).text = dataRestaurant?.name
    findViewById<TextView>(R.id.tv_item_city).text = dataRestaurant?.city
    findViewById<TextView>(R.id.tv_item_rating).text = dataRestaurant?.rating.toString()
    findViewById<TextView>(R.id.tv_item_address).text = dataRestaurant?.address
    findViewById<TextView>(R.id.tv_item_description).text = dataRestaurant?.description
    findViewById<Button>(R.id.btn_item).setOnClickListener {
      Toast.makeText(this, "You Share " + dataRestaurant?.name, Toast.LENGTH_SHORT).show()
    }
  }

  override fun onSupportNavigateUp(): Boolean {
    onBackPressed()

    return true
  }
}