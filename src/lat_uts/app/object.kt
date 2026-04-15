package lat_uts.app

import lat_uts.data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    val joko = Person()
    joko.firstName = "Joko"

    val budi = Person()
    budi.firstName = "Budi"


    println(eko.firstName)
    println(joko.firstName)
    println(budi.firstName)
}