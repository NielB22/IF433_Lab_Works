package lat_uts.data

class Adress {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    constructor(
        paramStreet: String,
        paramCity: String
    ) {
        street = paramStreet
        city = paramCity
    }

    constructor(
        paramStreet: String,
        paramCity: String,
        paramCountry: String
    ) : this(paramStreet, paramCity) {
        country = paramCountry
    }
}