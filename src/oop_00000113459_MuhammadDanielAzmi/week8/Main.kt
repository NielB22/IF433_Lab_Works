package oop_00000113459_MuhammadDanielAzmi.week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota tidak diketahui"

    println("Tujuan pengiriman : ${destination}")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {
        // blok ini hanya dieksekusi saat totalPrice tidak null
        price -> val tax = price * 0.11
        "Transaksi Valid. Harga: Rp.$price, Tax: $tax"
    } ?: "Transaksi Invalid. Harga belum di-set!"

    println(receipt)


    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String
        val num = item as? Int

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }

        num?.let {
            println("Ditemukan angka: ${it}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData: String? = null
    try {
        // BAHAYA: Maksa compiler percaya data ini tidka null
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        // Alih-alih apiResponse["token"]!!
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentifikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message) // Mencetak pesan error custom kita
    }
}