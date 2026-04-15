package lat_uts.data

class Note(title: String) {

    var title: String = title
        get() {
            println("Ini dari get()")
            return field
        }
        set(value) {
            if (value.isBlank()) {
                println("Data tidak berubah")
            }
            if (value.isNotBlank()) {
                field = value
                println("Ini dari set()")
                println("Data berubah!")
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.uppercase()
}