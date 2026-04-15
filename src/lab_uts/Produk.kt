package lab_uts

import lab_uts.Diskonable

abstract class Produk(
    protected val name: String,
    protected var harga: Double,
    protected var stok: Int
) {
    abstract fun tampilInfo()

    fun updateStock(jumlah: Int) {
       val hasil = stok + jumlah
       if (hasil < 0) {
           println("Gagal : stok tidak boleh minus!")
       } else {
           stok = hasil
       }
    }
}


class Laptop(
    name: String,
    harga: Double,
    stok: Int,
    val ramSize: Int
) : Produk(name, harga, stok), Diskonable {

    override fun tampilInfo() {
        var hargaPromo = hitungHargaDiskon(harga)
        println("--- Info Laptop ---")
        println("Nama   : $name")
        println("Harga  : Rp.$harga")
        println("Stok   : $stok")
        println("RamSize: $ramSize Gb")
        println("Harga Setelah diskon : Rp.$hargaPromo")
    }
}

class SmartPhone(
    name: String,
    harga: Double,
    stok: Int,
    val dualSim: Boolean
) : Produk(name, harga, stok) {

    override fun tampilInfo() {
        println("--- Info SmartPhone ---")
        println("Nama   : $name")
        println("Harga  : Rp.$harga")
        println("Stok   : $stok")
        println("RamSize: $dualSim")
    }
}