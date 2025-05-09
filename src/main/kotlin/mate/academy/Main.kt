package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val userName = readln()
        if (userName.isNotEmpty()) {
            println("Hello, $userName!")
        } else {
            println("Goodbye!")
            break
        }
    }
}

fun main() {
    greetUsers()
}
