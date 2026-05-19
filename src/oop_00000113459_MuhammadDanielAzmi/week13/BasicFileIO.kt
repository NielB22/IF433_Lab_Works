package oop_00000113459_MuhammadDanielAzmi.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("src/oop_00000113459_MuhammadDanielAzmi/week13/notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis")
}