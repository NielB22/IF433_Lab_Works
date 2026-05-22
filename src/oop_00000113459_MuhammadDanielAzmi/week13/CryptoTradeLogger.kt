package oop_00000113459_MuhammadDanielAzmi.week13

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