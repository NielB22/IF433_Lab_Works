package oop_00000113459_MuhammadDanielAzmi.week5

class Dosen(
    nama: String,
    val nidn: String
) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("$nama sedang mengajar mahasiswa di kelas.")
    }
}