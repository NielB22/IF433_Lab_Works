package oop_00000113459_MuhammadDanielAzmi.week5

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}