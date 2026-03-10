package oop_00000113459_MuhammadDanielAzmi.week6.tugas

fun main() {
    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    println("\n============= SMART HOME =============")
    println("SmartLamp    : ${lamp.id} - ${lamp.name}")
    println("SmartSpeaker : ${speaker.id} - ${speaker.name}")
    println("SmartCCTV    : ${cctv.id} - ${cctv.name}")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n====== SECURITY MODE ACTIVATED =======")
    hub.activateSecurityMode()


    println("\n======== TURN OFF ALL SWITCH =========")
    hub.turnOffAllSwitches()
}