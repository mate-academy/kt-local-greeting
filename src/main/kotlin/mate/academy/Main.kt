package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):" )
    val name = readlnOrNull();
    println("Hello, $name!")
}

fun main() {
    greetUsers()
}
