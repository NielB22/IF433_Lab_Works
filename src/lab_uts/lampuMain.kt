package lab_uts

import lab_uts.SensorCahaya
import lab_uts.LampuTeras
import lab_uts.LampuTamu
import lab_uts.Lampu

fun main() {
    val daftarLampu: List<Lampu> = listOf(
        LampuTeras("Lampu Teras Depan", 15),
        LampuTamu("Lampu Ruang Tamu", 25)
    )

    println("=== Lampu Rumah ===")

    for (lampu in daftarLampu) {

        lampu.nyalakan()

        if (lampu is SensorCahaya) {
            lampu.autoNyala()
        }

        if (lampu is LampuTamu) {
            lampu.ubahWarna("Merah")
        }
    }

}