package lat_uts.app

import lat_uts.data.Rectangle
import lat_uts.data.Shape
import lat_uts.data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)

    val triangle = Triangle()
    println(triangle.corner)

}