package lab_uts

sealed class StatusKirim {
    data class Terkirim(val penerima: String) : StatusKirim()
    data class Pending(val estimasiJam: Int) : StatusKirim()
}