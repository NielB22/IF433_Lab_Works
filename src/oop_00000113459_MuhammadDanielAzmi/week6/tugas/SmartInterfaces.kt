package oop_00000113459_MuhammadDanielAzmi.week6.tugas


interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {

    fun turnOn()
    fun turnOff()
}

interface Recordable {

    fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}