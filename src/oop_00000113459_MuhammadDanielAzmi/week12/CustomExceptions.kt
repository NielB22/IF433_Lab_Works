package oop_00000113459_MuhammadDanielAzmi.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance")