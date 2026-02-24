package oop_00000113459_MuhammadDanielAzmi.week03

fun main() {
    var wpn = Weapon("Excalibur")
    wpn.damage = 9999

    println()
    println("Tier: ${wpn.tier}")
    println("Damage: ${wpn.damage}")

    println()
    var pl = Player("Jon Snow")
    pl.addXp(50)
    pl.addXp(60)

    println("Level: ${pl.level}")
}