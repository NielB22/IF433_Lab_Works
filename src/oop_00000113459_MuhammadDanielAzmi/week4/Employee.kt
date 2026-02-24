package oop_00000113459_MuhammadDanielAzmi.week4

open class Employee(val name: String, val baseSalary: Double) {

    open fun work() {
        println("Employee $name sedang bekerja.")
    }

    open fun calculateBonus(): Double {
        return baseSalary * 0.1
    }
}