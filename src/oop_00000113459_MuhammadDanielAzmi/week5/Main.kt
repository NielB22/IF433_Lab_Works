package oop_00000113459_MuhammadDanielAzmi.week5

fun main() {
    val dosen1 = Dosen("Pak Snow", "0123456")
    val admin1 = Admin("Bu Danys")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya object Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR karena tipe referansinya adalah Pegawai

        // Smart Casting denan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("---------------------------------------------------")
    }
}