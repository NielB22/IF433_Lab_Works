package lat_uts.app

import lat_uts.data.City
import lat_uts.data.Country
import lat_uts.data.Location

fun main() {
    val locCity = City("Jakarta")
    val locCountry = Country("Indonesia")

    println("${locCity.name}, ${locCountry.name}")
}