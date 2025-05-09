package mate.academy

fun greetUsers() {
    generateSequence {
        print("Please enter a name (or press Enter to quit): ")
        readlnOrNull()
    }
        .takeWhile { it.isNotEmpty() }
        .forEach { println("Hello, $it!") }
}

fun main() {
    greetUsers()
}
