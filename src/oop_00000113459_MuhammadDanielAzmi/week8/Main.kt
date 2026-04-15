package oop_00000113459_MuhammadDanielAzmi.week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota tidak diketahui"

    println("Tujuan pengiriman : ${destination}")
}