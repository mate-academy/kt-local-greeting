package mate.academy

fun greetUsers() {
    while (true) {
        var text = readlnOrNull()
        if (text.isNullOrEmpty()) {
            break
        }
        println("Hello, $text!")
        println("Please enter a name (or press Enter to quit):")
    }
}

fun main() {
    greetUsers()
}
