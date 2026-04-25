package oop_00000113459_MuhammadDanielAzmi.week9

import lat_uts.data.User

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotilin", "Java", "C")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers: Set<Int> = setOf(1, 2, 2, 3, 3, 4)
    println("Unique numbers (setOf) : $uniqueNumbers")

    val activeUsers: MutableSet<String> = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserZ")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades : Map<String, String> = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A", // Value boleh duplikat, Keys tidak boleh!
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory: MutableMap<String, Int> = mutableMapOf(
        "Apple" to 50,
        "Bananas" to 30
    )
    inventory["Apple"] = 30
    inventory["DragonFruit"] = 25
    println("Inventory: $inventory")
}

