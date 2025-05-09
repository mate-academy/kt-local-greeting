package mate.academy

const val GREETING = "Please enter a name (or press Enter to quit): "

fun greetUsers() {
    while (true) {
        println(GREETING)
        val userName: String = readlnOrNull().toString().ifEmpty { return }
        println("Hello, $userName!")
    }
}

fun main() {
    greetUsers()
}
