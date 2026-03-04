package oop_00000113459_MuhammadDanielAzmi.week5

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {

    private lateinit var retbalance: Any

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sukes!")
            println("Sudah dibayar  : $amount")
            println("Sisa saldo     : $balance")
        } else {
            println("Pembayaran tidak berhasil!")
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("TopUp berhasil!. saldo sekarang: $balance")
    }
}