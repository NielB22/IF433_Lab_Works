package oop_00000113459_MuhammadDanielAzmi.week9

fun main() {
    val tradehistory: List<TradeLog> = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 7.3, "OPEN"),
        TradeLog(pair = "BTCUSDT", position = "LONG",  leverage = 10, roe =  8.5,  status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "SHORT", leverage = 5,  roe = -3.2,  status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "LONG",  leverage = 20, roe =  12.7, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "SHORT", leverage = 10, roe = -6.1,  status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "LONG",  leverage = 15, roe =  4.3,  status = "OPEN"),
        TradeLog(pair = "SOLUSDT", position = "SHORT", leverage = 8,  roe = -1.5,  status = "OPEN"),
    )

    val closedTrades = tradehistory
        .filter { it.status == "CLOSED" }

    val winningTrades = closedTrades
        .filter { it.roe > 0.0 }

    val losingTrades = closedTrades
        .filter { it.roe <= 0.0 }


    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
}