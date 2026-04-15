package lab_uts

import lab_uts.Paket
import lab_uts.TipeLayanan
import lab_uts.DataPusat
import lab_uts.ProsesKurir
import lab_uts.StatusKirim

fun main() {
    val paket1 = Paket("", TipeLayanan.REGULER)
    val paket2 = Paket("SW-001", TipeLayanan.EXPRESS)

    val dafterProses = listOf(ProsesKurir(paket1), ProsesKurir(paket2))

    println("=== SISTEM LOGISTIK SOBATWEB ===")

    for (proses in dafterProses) {
        val hasil = proses.cek()
        val infoPaket = proses.p

        print("Layanan: ${infoPaket.layanan} (Rp ${infoPaket.layanan.ongkir})")

        when (hasil) {
            is StatusKirim.Pending -> {
                print("Status : PENDING")
                print("Catatan: Mohon tunggu, estimasi ${hasil.estimasiJam} jam.")
            }
            is StatusKirim.Terkirim -> {
                println("Status : TERKIRIM")
                println("Penerima: ${hasil.penerima}")
            }
        }
        println("--------------------------------")
    }

    DataPusat.laporan()
}