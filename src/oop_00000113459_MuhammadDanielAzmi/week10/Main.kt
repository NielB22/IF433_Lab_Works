package oop_00000113459_MuhammadDanielAzmi.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("isi intBox: ${intBox.value}")
    println("isi stringBox: ${stringBox.value}")

}