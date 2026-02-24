package oop_00000113459_MuhammadDanielAzmi.week4

class Manager(name: String, baseSalary: Double): Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Double {
        return super.calculateBonus() + 50000
    }
}