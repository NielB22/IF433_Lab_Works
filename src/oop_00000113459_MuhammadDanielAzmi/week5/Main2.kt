package oop_00000113459_MuhammadDanielAzmi.week5

fun main() {

    // Membuat objek
    val eWallet = EWallet("Jon Snow", 50000.0)
    val creditCard = CreditCard("Jon Snow", 100000.0)

    // Memasukkan ke dalam list bertipe PaymentMethod
    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    // Perulangan dan proses pembayaran
    for (method in paymentMethods) {
        println("=== Proses pembayaran dengan ${method.accountName} ===")
        method.processPayment(75000.0)
        println()
    }
}