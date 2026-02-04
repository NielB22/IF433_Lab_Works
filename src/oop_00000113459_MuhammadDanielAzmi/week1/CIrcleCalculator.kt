package oop_00000113459_MuhammadDanielAzmi.week1

fun main(args: Array<String>) {

    val radius = 7.0
    val pi = 3.14

    var area: Double = radius * pi * radius

    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}