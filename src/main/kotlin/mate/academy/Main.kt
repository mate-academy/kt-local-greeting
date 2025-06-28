package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val userName = readLine()
    println("Hello, $userName!")
}

fun main() {
    greetUsers()
}
