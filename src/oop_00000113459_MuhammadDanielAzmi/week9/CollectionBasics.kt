package oop_00000113459_MuhammadDanielAzmi.week9

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotilin", "Java", "C")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}

