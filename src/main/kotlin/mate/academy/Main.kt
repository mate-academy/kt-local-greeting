package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit): ")

    generateSequence { readln() }
        .takeWhile { it.isNotBlank() }
        .forEach { println("Hello, $it!") }
}

fun main() {
    greetUsers()
}
