package lab_uts

class ProsesKurir(val p: Paket) {

    fun cek(): StatusKirim {
        DataPusat.totalOngkir += p.layanan.ongkir

        return if (p.resi.isEmpty()) {
            StatusKirim.Pending(24)
        } else {
            StatusKirim.Terkirim("Customer SobatWeb")
        }
    }
}