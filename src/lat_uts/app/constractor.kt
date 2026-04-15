package lat_uts.app

import lat_uts.data.Car

fun main() {
    val avanza = Car("Toyota")

    val creta = Car("Hyundai", "Prime")

    println(avanza.brand)
    println(avanza.year)
    println(creta.brand)
    println(creta.year)
}