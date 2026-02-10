package oop_00000113459_MuhammadDanielAzmi.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKAS PMB UMN ---")

    println("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    println("Masukkan GPA: ")
    val gpa = scanner.nextDouble()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        println("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, gpa, major)
        println("Status: Pendaftaran Selesai.")
    }

}