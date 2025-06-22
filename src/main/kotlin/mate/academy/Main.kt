package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name = readlnOrNull()?.trim()?.ifBlank { return }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
