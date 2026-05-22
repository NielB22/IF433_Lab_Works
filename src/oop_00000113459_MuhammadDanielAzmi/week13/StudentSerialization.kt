package oop_00000113459_MuhammadDanielAzmi.week13

import java.io.File
import java.io.FileNotFoundException

// --- LANGKAH 1: Struktur Data Class ---
data class Student(val name: String, val age: Int, val gpa: Double)

// --- LANGKAH 2: Extension Functions untuk Transformasi ---
// Serialization (Object -> CSV)
fun Student.toCsv(): String = "$name,$age,$gpa"

// Deserialization (CSV -> Object)
fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(
        name = parts[0].trim(),
        age = parts[1].trim().toInt(),
        gpa = parts[2].trim().toDouble()
    )
}