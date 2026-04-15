package lat_uts.app

import lat_uts.data.Employee
import lat_uts.data.Manager
import lat_uts.data.VicePresident

fun main() {

    val employee = Employee("Saiful")
    employee.sayHello("Pahlevi")

    val manager = Manager("Budi")
    manager.sayHello("Joko")

    val vicePresident = VicePresident("Rehan")
    vicePresident.sayHello("Reza")
}