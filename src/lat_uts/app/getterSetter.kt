package lat_uts.app

import lat_uts.data.Note
import lat_uts.data.BigNote

fun main() {
    val note = Note("Apapun")

    println(note.title)

    note.title = "Apapun 1"
    println(note.title)

    val bigNote = BigNote("Apapun BIG")
    println(bigNote.bigTitle)
}