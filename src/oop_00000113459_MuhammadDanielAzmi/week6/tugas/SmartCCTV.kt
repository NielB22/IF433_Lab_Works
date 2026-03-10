package oop_00000113459_MuhammadDanielAzmi.week6.tugas

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun startRecord() {
        println("CCTV Start recording.")
    }

    override fun turnOn() {
        println("CCTV turned on")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV turned off")
    }
}