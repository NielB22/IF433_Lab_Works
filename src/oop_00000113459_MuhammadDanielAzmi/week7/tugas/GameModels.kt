package oop_00000113459_MuhammadDanielAzmi.week7.tugas

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(7),
    EPIC(2),
    LEGENDARY(1);
}

data class GameItem(
    val name: String,
    val demage: Int,
    val rarity: ItemRarity
)