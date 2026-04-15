package oop_00000113459_MuhammadDanielAzmi.week8

class NitificationServices {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // INI AKAN ERROR: Type mismatch

        if (user.email != null) {
            // SUCCESS via smart cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}