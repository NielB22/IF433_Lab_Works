package oop_00000113459_MuhammadDanielAzmi.week2

class Loan(
    var bookTitle: String,
    var borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        var denda: Int = 0
        if (loanDuration > 3) {
            denda = (loanDuration - 3) * 2000
        } else {
            return denda
        }
        return denda
    }
}
