package oop_00000113459_MuhammadDanielAzmi.week5

fun main() {
    var math = MathHelper()

    var persegi = math.hitungLuas(5)
    var persegiPanjang = math.hitungLuas(5, 10)
    var lingkaran = math.hitungLuas(12)

    println("======= Math Helper =======")
    println("Persegi        : $persegi")
    println("PersegiPanjang : $persegiPanjang")
    println("Ling karan     : $lingkaran")
}