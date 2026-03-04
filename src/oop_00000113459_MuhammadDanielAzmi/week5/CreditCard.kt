package oop_00000113459_MuhammadDanielAzmi.week5

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi sukses!")
            println("Jumlah dibayar: $amount")
            println("Total terpakai: $usedAmount")
            println("Sisa limit: ${limit - usedAmount}")
        } else {
            println("Transaksi ditolak! melebihi limit: $limit")
        }
    }
}