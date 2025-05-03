package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val userName = readlnOrNull()
    if (!userName.isNullOrEmpty()) {
        println("Hello, $userName!")
        greetUsers()
    }
}

fun main() {
    greetUsers()
}
