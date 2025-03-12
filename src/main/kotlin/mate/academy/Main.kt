package mate.academy

const val WELCOME_USER = "Please enter a name (or press Enter to quit):"

fun greetUsers() {
    println(WELCOME_USER)
    println("Hello ${readlnOrNull()}")
}

fun main() {
    greetUsers()
}
