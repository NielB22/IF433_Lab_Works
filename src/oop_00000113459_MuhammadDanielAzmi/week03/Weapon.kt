package oop_00000113459_MuhammadDanielAzmi.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Damage tidak boleh negatif. Nilai lama dipertahankan.")
                return
            }

            field = if (value > 1000) 1000 else value
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
