package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val text = readlnOrNull()
        if (text.isNullOrEmpty()) {
            break
        }
        println("Hello, $text!")
    }
}

fun main() {
    greetUsers()
}
