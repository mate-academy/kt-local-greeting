package mate.academy

fun greetUsers() {
    do {
        println("Please enter a name (or press Enter to quit):")
        val name = readlnOrNull()
        if (name != "") {
            println("Hello, $name!")
        }
    } while (name != "")
}

fun main() {
    greetUsers()
}
