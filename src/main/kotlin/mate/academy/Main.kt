package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name = readlnOrNull()
        if (name?.isBlank() == true) {
            break
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
