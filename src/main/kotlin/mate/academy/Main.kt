package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val name = readLine() ?: ""
    if (name.isEmpty()) {
        return
    } else
    println("Hello, $name!")
    greetUsers()
}

fun main() {
    greetUsers()
}
