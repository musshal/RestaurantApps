package com.musshal.restaurantapps

object RestaurantsData {
  private val restaurantsName = arrayOf(
    "Bring Your Phone Cafe",
    "Run The Gun",
    "Pangsit Express",
    "Kafe Kita",
    "Kafein",
    "Makan Mudah",
    "Saya Suka",
    "Gigitan Cepat",
    "Fairy Cafe",
    "Melting Pot",
  )

  private val restaurantsDescription = arrayOf(
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet.",
    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. " +
            "Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur " +
            "ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. " +
            "Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, " +
            "vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. " +
            "Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus " +
            "elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor " +
            "eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, " +
            "feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet."
  )

  private val restaurantsPicture = arrayOf(
    R.drawable.bring_your_phone_cafe,
    R.drawable.run_the_gun,
    R.drawable.pangsit_express,
    R.drawable.kafe_kita,
    R.drawable.kafein,
    R.drawable.makan_mudah,
    R.drawable.saya_suka,
    R.drawable.gigitan_cepat,
    R.drawable.fairy_cafe,
    R.drawable.melting_pot
  )

  private val restaurantsCity = arrayOf(
    "Medan",
    "Bali",
    "Ternate",
    "Gorontalo",
    "Bali",
    "Malang",
    "Surabaya",
    "Aceh",
    "Malang",
    "Medan"
  )

  private  val restaurantsAddress = arrayOf(
    "Jln. Belimbing Timur No. 27",
    "Jln. Pandeglang No. 19",
    "Jln. Pustakawan No. 9",
    "Jln. Belimbing Timur No. 27",
    "Jln. Belimbing Timur No. 27",
    "Jln. Pandeglang No. 19",
    "Jln. Pustakawan No. 9",
    "Jln. Belimbing Timur No. 27","Jln. Belimbing Timur No. 27",
    "Jln. Pandeglang No. 19",
    "Jln. Pustakawan No. 9",
  )

  private  val restaurantsRating = arrayOf(4.6, 4.6, 4.8, 4.0, 3.8, 4.6, 3.6, 4.0, 3.9, 4.2)

  val listData: ArrayList<Restaurant>
    get() {
      val list = arrayListOf<Restaurant>()

      for (position in restaurantsName.indices) {
        val restaurant = Restaurant()

        restaurant.name = restaurantsName[position]
        restaurant.description = restaurantsDescription[position]
        restaurant.picture = restaurantsPicture[position]
        restaurant.city = restaurantsCity[position]
        restaurant.rating = restaurantsRating[position]
        restaurant.address = restaurantsAddress[position]

        list.add(restaurant)
      }

      return list
    }
}