package oop_00000113459_MuhammadDanielAzmi.week6

class Button(
    override val name: String
) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!" )
    }
}