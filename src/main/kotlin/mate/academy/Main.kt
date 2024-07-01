package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name: String = readlnOrNull().orEmpty()
        name.ifEmpty {
            return
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
