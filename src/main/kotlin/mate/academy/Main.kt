package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit)")
        var username : String? = readlnOrNull()
        if (username == null || username == "") {
            return
        } else {
            println("Hello, $username")
        }
    }
}

fun main() {
    greetUsers()
}
