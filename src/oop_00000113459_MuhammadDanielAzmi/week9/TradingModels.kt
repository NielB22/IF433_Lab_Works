package oop_00000113459_MuhammadDanielAzmi.week9

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)