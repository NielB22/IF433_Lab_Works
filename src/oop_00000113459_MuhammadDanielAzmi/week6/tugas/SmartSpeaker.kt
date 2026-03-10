package oop_00000113459_MuhammadDanielAzmi.week6.tugas

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("SmartSpeaker turned on.")
    }

    override fun turnOff() {
        println("SmartSpeaker turned off.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song di Spotify")
    }
}