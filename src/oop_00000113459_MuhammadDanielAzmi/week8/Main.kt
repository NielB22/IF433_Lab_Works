package oop_00000113459_MuhammadDanielAzmi.week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota tidak diketahui"

    println("Tujuan pengiriman : ${destination}")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {
        // blok ini hanya dieksekusi saat totalPrice tidak null
        price -> val tax = price * 0.11
        "Transaksi Valid. Harga: Rp.$price, Tax: $tax"
    } ?: "Transaksi Invalid. Harga belum di-set!"

    println(receipt)
}