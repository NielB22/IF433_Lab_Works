package lat_uts.app

import lat_uts.data.Person

fun main() {
    val eko = Person()

    eko.firstName = "Eko"

    println(eko.sayhello("Adi", "Setiawan"))
}