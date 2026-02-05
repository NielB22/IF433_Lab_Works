package oop_00000113459_MuhammadDanielAzmi.week1

fun main() {

    val radius = 7.0
    val pi = 3.14

    var area: Double = radius * pi * radius

    println("Radius: $radius, Area: $area")

    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"