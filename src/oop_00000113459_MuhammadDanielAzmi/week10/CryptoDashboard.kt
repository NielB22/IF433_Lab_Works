package oop_00000113459_MuhammadDanielAzmi.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    // Lanjutan di dalam main()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 100.0))

    // Lanjutan di dalam main()
    val response = ApiResponse("200 OK", coinRepo.getAll())
}