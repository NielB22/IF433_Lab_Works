package lat_uts.app

import lat_uts.data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    eko.sayhello("Budi")
    eko.sayhello("Joko", "Widodo")
}