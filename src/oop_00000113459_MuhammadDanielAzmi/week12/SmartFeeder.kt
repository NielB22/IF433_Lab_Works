package oop_00000113459_MuhammadDanielAzmi.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("\n--- JADWAL MAKAN PAGI ---")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Peringatan: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan: ${e.message}")
    } catch (e: Exception) {
        println("Kesalahan Umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai. ")
    }

    println("\n--- JADWAL MAKAN SORE ---")
    runCatching {
        dispenseKibble(30, 1000, false)
    }

        .onSuccess { newStock ->
            currentKibbleStock = newStock
            println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
        }

        .onFailure { error ->
            println("Peringatan ke Pemilik: ${error.message}")
            println("(Opsional: Berikan chicken jerky secara manual)")
        }
}