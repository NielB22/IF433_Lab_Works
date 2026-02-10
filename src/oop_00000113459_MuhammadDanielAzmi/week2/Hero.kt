package oop_00000113459_MuhammadDanielAzmi.week2

class Hero(
    var name: String,
    var hp: Int = 100,
    var baseDamage: Int
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}
