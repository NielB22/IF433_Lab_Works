package oop_00000113459_MuhammadDanielAzmi.week9

fun main() {
    println("=== TEST LAMBDA ===")
    // syntax lambda eksplisit: { parameters -> body }
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(3, 10)}")

    // Lambda dengan satu parameter bisa menggunakan implicit 'it'
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}