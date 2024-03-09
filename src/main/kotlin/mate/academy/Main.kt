package mate.academy

fun main() {
    greetUsers()
}

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit): ")
        val name = readlnOrNull()
        if (!name.isNullOrEmpty()) {
            println("Hello, $name!")
        }
    }
}
