package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name: String? = readLine()
        if (name?.isBlank() == true) {
            break
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
