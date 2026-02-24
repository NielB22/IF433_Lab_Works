package oop_00000113459_MuhammadDanielAzmi.week4

fun main() {
    val em = Employee("Jon Snow", 20000000.0)
    val man = Manager("Jon Snow", 20000000.0)
    val dev = Developer("Jon Snow", 20000000.0, "JavaScript")

    println("=== Manager ===")
    man.work()
    man.calculateBonus()

    println()
    println("=== Developer ===")
    dev.work()
    dev.calculateBonus()
}