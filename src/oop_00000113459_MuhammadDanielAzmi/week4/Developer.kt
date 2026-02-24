package oop_00000113459_MuhammadDanielAzmi.week4

class Developer(
    name: String,
    baseSalary: Double,
    val programmingLanguage: String
): Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}