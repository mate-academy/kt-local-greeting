package mate.academy

fun greetUsers() {
    // implement function
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name = readLine() ?: ""
        if (name.isBlank()) {
            break
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
