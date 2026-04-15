package lab_uts

interface SensorCahaya {
    fun autoNyala() {
        println("Nyala!")
    }
}

abstract class Lampu(
    protected var name: String,
    protected var watt: Int
) {
    abstract fun nyalakan()
}

class LampuTeras(name: String, watt: Int) : Lampu(
    name,
    watt
), SensorCahaya{

    override fun nyalakan() {
        println("lampu teras Nyala!")
    }
}

class LampuTamu(name: String, watt: Int) : Lampu(name, watt) {

    override fun nyalakan() {
        println("lampu Nyala!")
    }

    fun ubahWarna(warna: String) {
        println("Gani warna $warna!")
    }
}