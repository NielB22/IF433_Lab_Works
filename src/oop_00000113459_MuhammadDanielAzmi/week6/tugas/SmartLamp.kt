package oop_00000113459_MuhammadDanielAzmi.week6.tugas

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("SmartLamp turned on.")
    }

    override fun turnOff() {
        println("SmartLamp turned off.")
    }
}