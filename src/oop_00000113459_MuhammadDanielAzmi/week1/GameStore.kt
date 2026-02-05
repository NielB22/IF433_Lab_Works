package oop_00000113459_MuhammadDanielAzmi.week1

fun main() {

    val gameTitle: String = "The Last Of Us Part2"
    val price: Int = 600000
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price - (price * 20/100)
    else price - (price * 10/100)