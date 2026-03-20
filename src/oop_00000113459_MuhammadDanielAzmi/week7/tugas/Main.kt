package oop_00000113459_MuhammadDanielAzmi.week7.tugas

fun main() {

    println("\n==== MINI GAMES OOP ==== ")
    GameManager.startGame()
    GameManager.startGame()

    var rarityL = ItemRarity.LEGENDARY
    println("Drop chance Legendary : ${rarityL.dropChance}%")

    var weaponS = Weapon.forgeStarterSword()
    println("Name       : ${weaponS.item.name}")
    println("Damage     : ${weaponS.item.damage}")
    println("Rarity     : ${weaponS.item.rarity}")
    println("Durability : ${weaponS.durability}")
}