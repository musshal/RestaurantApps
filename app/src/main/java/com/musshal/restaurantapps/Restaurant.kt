package com.musshal.restaurantapps

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Restaurant(
  var name: String = "",
  var description: String = "",
  var picture: Int = 0,
  var city: String = "",
  var rating: Double = 0.0,
  var address: String = "",
) : Parcelable
