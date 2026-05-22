package oop_00000113459_MuhammadDanielAzmi.week13

import java.io.File
import java.io.FileNotFoundException

// 1. Model Data (CHECKPOINT 11)
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)


// 2. Serialization (CHECKPOINT 12)
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"


// 3 & 4 Deserialization & Robust Error Handling (CHECKPOINT 13 & 14)
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        // Menangkap NumberFormatException atau IndexOutOfBoundsException secara aman
        println("(Log) Data korup diabaikan: $line")
        null
    }
}


// 5. Write System (CHECKPOINT 15)
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}


// 6. Load System / Safe Skip (CHECKPOINT 16)
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File $path tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    // 7. Dashboard Setup & Mock Data (CHECKPOINT 17)
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 150.0, 45.5),
        TradeRecord(2, "ETHUSDT", "Short", 100.0, -12.3),
        TradeRecord(3, "SOLUSDT", "Long", 75.0, 18.2)
    )
    val filePath = "crypto_trades.csv"
    saveTrades(mockTrades, filePath)
}