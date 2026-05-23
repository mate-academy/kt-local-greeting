package mate.academy

fun greetUsers() {
    println("Please enter your name:")
    val name = readLine()
    println("Hello, $name!")
}

fun main() {
    greetUsers()
}
