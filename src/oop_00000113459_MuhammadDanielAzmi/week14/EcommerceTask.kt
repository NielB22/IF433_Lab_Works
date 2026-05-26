package oop_00000113459_MuhammadDanielAzmi.week14

import java.io.File
import java.io.FileWriter

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan kalkulasi I/O Notifikasi sekali
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName, $finalPrice, $customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// Abstraksi untuk Repository (DIP)
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

// Implementasi penulisan CSV dengan safe resource handling .use {}
class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        // Menggunakan FileWriter dan .use untuk auto-close resource mencegah memory leak
        FileWriter(file, true).use { writer ->
            writer.write("$itemName, $finalPrice, $customerType\n")
        }
    }
}

// Abstraksi untuk Notification (DIP)
interface NotificationService {
    fun sendNotification(itemName: String)
}

// Implementasi pengiriman email ke konsol
class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// Class Bot Utama hasil Dependency Injection
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    // Fungsi sementara penyeimbang struktur sebelum OCP diterapkan penuh
    fun processOrder(itemName: String, finalPrice: Double, customerType: String) {
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}