package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val name = readlnOrNull() ?: ""
    if (name.isNotBlank()) {
        println("Hello, $name!")
        greetUsers()
    }
}

fun main() {
    greetUsers()
}
