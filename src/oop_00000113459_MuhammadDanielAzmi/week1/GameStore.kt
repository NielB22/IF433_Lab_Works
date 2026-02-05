package oop_00000113459_MuhammadDanielAzmi.week1

fun main() {

    val gameTitle: String
    val price: Int

    printReceipt(title = "The Last Of Us Part 2", finalPrice = 600000)
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price - (price * 20/100)
    else price - (price * 10/100)

fun printReceipt(title: String, finalPrice: Int){
    val afterDiscount = calculateDiscount(finalPrice)
    println("Game: $title | Harga: $afterDiscount")
}