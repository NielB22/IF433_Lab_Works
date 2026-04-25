package oop_00000113459_MuhammadDanielAzmi.week9

import lat_uts.data.User

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotilin", "Java", "C")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90, 85)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST TEST ===")
    val uniqueNumbers: Set<Int> = setOf(1, 2, 2, 3, 3, 4)
    println("Unique numbers (setOf) : $uniqueNumbers")

    val activeUsers: MutableSet<String> = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserZ")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")
}

