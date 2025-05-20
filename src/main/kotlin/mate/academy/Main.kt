package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val name = readLine()
    println("Hello, $name!")
}

fun main() {
    greetUsers()

}
