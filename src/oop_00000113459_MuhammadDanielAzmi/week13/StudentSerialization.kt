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

// --- LANGKAH 3: Sistem Pemuatan (Save & Load) ---
fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString(separator = "\n") { it.toCsv() })
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}


// --- LANGKAH 4: Eksekusi Utama ---
fun main() {
    val students = listOf(
        Student(name = "Alice", age = 20, gpa = 3.8),
        Student(name = "Bob", age = 22, gpa = 3.5)
    )

    saveStudents(students, "src/oop_00000113459_MuhammadDanielAzmi/week13/students.csv")

    val loaded = loadStudents("src/oop_00000113459_MuhammadDanielAzmi/week13/students.csv")
    println("=== LOADED STUDENT DATA ===")
    loaded.forEach { println(it) }
}