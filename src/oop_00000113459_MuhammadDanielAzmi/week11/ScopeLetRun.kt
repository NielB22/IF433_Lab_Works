package oop_00000113459_MuhammadDanielAzmi.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"
    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")

    fun runBlock() {
        println("\n=== TEST RUN FUNCTION ===")
        val result = "Kotlin".run {
            println("Memproses kata: ${this}")
            this.length * 2
        }
        println("Hasil kalkulasi run: $result")
    }
}