package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name = readLine().orEmpty()
        if (name.isBlank()) break
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
