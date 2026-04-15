package lat_uts.app

import lat_uts.data.User

fun main() {

    val user1 = User("eko", "123")
    val user2 = User("budi", "123")

    user1.password = "1234"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}