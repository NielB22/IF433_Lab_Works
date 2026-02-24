package oop_00000113459_MuhammadDanielAzmi.week4

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    var batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}