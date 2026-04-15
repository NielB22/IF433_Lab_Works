package lat_uts.data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "Cat"
    override fun run() {
        println("${this.name} is running...")
    }
}

class Dog : Animal() {
    override val name: String = "Dog"
    override fun run() {
        println("${this.name} is running...")
    }
}