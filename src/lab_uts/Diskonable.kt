package lab_uts

interface Diskonable {
    fun hitungHargaDiskon(harga: Double) : Double {
        return harga - (harga * 10/100)
    }
}