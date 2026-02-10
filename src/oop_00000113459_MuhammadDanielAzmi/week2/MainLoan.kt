package oop_00000113459_MuhammadDanielAzmi.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("-- LIBRARY ONLINE UMN --")
    print("Judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama pinjam (hari): ")
    val inputDuration = scanner.nextInt()
    val loanDuration = if (inputDuration < 0) 1 else inputDuration

    val loan = Loan(bookTitle, borrower, loanDuration)


    println("\n-- Detail Peminjaman --")
    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama pinjam: ${loan.loanDuration} hari")
    println("Total denda: Rp ${loan.calculateFine()}")
}
