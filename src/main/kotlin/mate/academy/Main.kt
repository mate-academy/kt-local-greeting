package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name = readlnOrNull()
        if (name.isNullOrBlank()) {
            return
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
