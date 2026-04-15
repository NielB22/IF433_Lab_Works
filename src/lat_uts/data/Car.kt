package lat_uts.data

class Car(
    paramBrand: String,
    paramName: String,
    paramYear: Int = 2020
) {

    init {
        println("Car $paramBrand, Year $paramYear Dibuat!")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2000) {
        println("Secondary Constructor")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Third Constructor")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}