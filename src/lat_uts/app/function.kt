package lat_uts.app

import lat_uts.data.Person

fun main() {
    val eko = Person()

    eko.firstName = "Eko"
    eko.midName = "Setiawan"
    eko.lastName = "Nugroho"

    println(eko.getFullName())
    eko.sayhello("Niel")
    eko.run()
}