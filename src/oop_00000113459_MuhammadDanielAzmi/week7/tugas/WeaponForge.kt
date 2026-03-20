package oop_00000113459_MuhammadDanielAzmi.week7.tugas

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {

        fun forgeStarterSword() : Weapon {
            val item = GameItem(
                "Pedang Kayu Bapuk",
                5,
                ItemRarity.COMMON
            )

            return Weapon(item, durability = 50)
        }

        fun forgeEpicSword() : Weapon {
            val item = GameItem(
                "Pedang Epic Api",
                50,
                ItemRarity.EPIC
            )

            return Weapon(item, durability = 100)
        }
    }
}