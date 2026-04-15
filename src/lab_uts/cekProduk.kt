package lab_uts

import lab_uts.Laptop
import lab_uts.SmartPhone

fun main() {
    val laptop = Laptop("Katana", 10000000.0, 5, 256)
    val hp = SmartPhone("Samsung", 5000000.0, 5, true)

    println(laptop.tampilInfo())
    println(hp.tampilInfo())
}