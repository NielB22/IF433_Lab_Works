package oop_00000113459_MuhammadDanielAzmi.week6

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("processing Rp$amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp$amount via CreditCard")
    }
}