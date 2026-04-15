package lat_uts.app

import lat_uts.data.Adress

fun main() {
    val address1 = Adress("Jl. MhT", "Jakarta")
    val address2 = Adress("Jl.MhT", "Jakarta", "Indonesia")

    println(address1.street)
    println(address1.city)
    println(address2.street)
    println(address2.city)
    println(address2.country)
}