package oop_00000113459_MuhammadDanielAzmi.week7

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}