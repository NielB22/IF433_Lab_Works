package oop_00000113459_MuhammadDanielAzmi.week7

object DatabaseManager {
    var connectionStatus :String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}