package lat_uts.data

class Person{
    var firstName: String = ""
    var midName: String? = null
    var lastName: String = ""

    fun sayhello(name: String) {
        println("Hello $name, my name is $firstName")
    }

    fun sayhello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }

    fun run() {
        println("Run")
    }

    fun getFullName() : String {
        return "$firstName $midName $lastName"
    }
}