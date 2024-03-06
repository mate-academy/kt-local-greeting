package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        when (val name = readln()) {
            "" -> break
            else -> println("Hello, ${name}!")
        }
    }
}

fun main() {
    greetUsers()
}
