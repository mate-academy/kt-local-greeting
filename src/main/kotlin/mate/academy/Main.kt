package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit): ")
    val name = readln()
    if (name.isNullOrEmpty()) {
        println("You didn't enter a valid name. Goodbye!")
    } else {
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
