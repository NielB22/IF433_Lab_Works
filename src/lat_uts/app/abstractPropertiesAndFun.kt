package lat_uts.app

import lat_uts.data.Cat
import lat_uts.data.Dog

fun main() {

    val cat = Cat()
    val dog = Dog()

    println(cat.name)
    cat.run()

    println(dog.name)
    dog.run()
}