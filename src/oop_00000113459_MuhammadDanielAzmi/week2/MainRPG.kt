package oop_00000113459_MuhammadDanielAzmi.week2

import java.util.Scanner

fun main() {
    var nama: String
    var damage: Int
    var enemyHp = 100

    val scanner = Scanner(System.`in`)
    println("--- MINI RPG GAME ---")

    println("Masukkan Nama Hero: ")
    nama = scanner.nextLine()

    println("Masukkan Base Damage Hero (10-20): ")
    damage = scanner.nextInt()

    val hero = Hero(name = nama, baseDamage = damage)

    while (hero.isAlive() && enemyHp > 0) {
        print("Pilih Aksi! (1. Serang, 2. Kabur): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) {
                enemyHp = 0
            }
            println("Sisa HP musuh: $enemyHp")

            if (enemyHp > 0) {
                hero.takeDamage((10..20).random())
                println("Sisa HPmu: ${hero.hp}")
            }
        } else if (type == 2) {
            println("Kaburrrrr.....")
            break
        }
    }

    if (hero.isAlive() && enemyHp <= 0) {
        println("Hero menang!")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Musuh menang!")
    } else {
        println("Pertarungan berakhir.")
    }
}
