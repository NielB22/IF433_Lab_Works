package oop_00000113459_MuhammadDanielAzmi.week6

class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity

    override fun turnOn() {
        super<Phone>.turnOn() // Menjalankan logika kamera
        super<Phone>.turnOn() // Menjalankan logika phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}