package com.musshal.restaurantapps

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListRestaurantAdapter(private val listRestaurant: ArrayList<Restaurant>) :
  RecyclerView.Adapter<ListRestaurantAdapter.ListViewHolder>() {
  inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    val tvCity: TextView = itemView.findViewById(R.id.tv_item_city)
    val tvRating: TextView = itemView.findViewById(R.id.tv_item_rating)
    val imgPicture: ImageView = itemView.findViewById(R.id.img_item_picture)

    fun bind(restaurant: Restaurant) {
      tvName.text = restaurant.name
      tvDescription.text = restaurant.description
      tvCity.text = restaurant.city
      tvRating.text = restaurant.rating.toString()
      imgPicture.setImageResource(restaurant.picture)
      itemView.setOnClickListener {
        val intent = Intent(itemView.context, DetailRestaurantActivity::class.java)
        intent.putExtra(DetailRestaurantActivity.KEY_RESTAURANT, restaurant)
        itemView.context.startActivity(intent)
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
    val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_restaurant,
      parent, false)

    return ListViewHolder(view)
  }

  override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
    val restaurant = listRestaurant[position]

    Glide.with(holder.itemView.context)
      .load(restaurant.picture)
      .apply(RequestOptions().override(100, 100))
      .into(holder.imgPicture)

    holder.tvName.text = restaurant.name
    holder.tvCity.text = restaurant.city
    holder.tvRating.text = restaurant.rating.toString()
    holder.tvDescription.text = restaurant.description

    holder.bind(listRestaurant[position])
  }

  override fun getItemCount(): Int = listRestaurant.size
}