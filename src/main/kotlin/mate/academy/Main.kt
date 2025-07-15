package mate.academy

fun greetUsers() {
    generateSequence {
        print("Please enter a name (or press Enter to quit): ")
        readlnOrNull()?.takeIf { it.isNotBlank() }?.trim()
    }.forEach { name ->
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
