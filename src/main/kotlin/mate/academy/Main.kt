package mate.academy

private const val QUESTION = "Please enter a name (or press Enter to quit)\n"

fun greetUsers() {
    print(QUESTION)
    var name = readLine()
    while (name != null && name.isNotBlank()) {
        println("Hello, $name!")
        print(QUESTION)
        name = readLine()
    }
}

fun main() {
    greetUsers()
}
