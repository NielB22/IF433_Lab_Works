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