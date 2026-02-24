package oop_00000113459_MuhammadDanielAzmi.week03

class Player(var username: String){

    private var xp: Int = 0
    var level: Int = 1
        private set

    fun addXp(amount: Int){

        if (amount <= 0){
            println("XP harus positif!")
            return
        }

        val oldLevel = level

        xp += amount
        level = (xp / 100) + 1

        if (level > oldLevel){
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}