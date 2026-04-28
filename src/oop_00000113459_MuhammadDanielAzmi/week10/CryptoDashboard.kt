package oop_00000113459_MuhammadDanielAzmi.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    // Lanjutan di dalam main()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 100.0))

    // Lanjutan di dalam main()
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // Lanjutan di dalam main()
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    // Lanjutan di dalam main()
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.01))
    txRepo.add(Transaction("TX002", 0.5))


    println("\nHistory Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}, Amount: ${tx.amount}")
    }
}