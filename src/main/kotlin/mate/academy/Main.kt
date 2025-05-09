package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit)")
        var username : String? = readlnOrNull()
        if (username.isNullOrBlank()) return else println("Hello, $username")
    }
}

fun main() {
    greetUsers()
}
