package mate.academy

private const val TEXT = "Please enter a name (or press Enter to quit):"

fun greetUsers() {
    var name: String?
    do {
        println(TEXT)
        name = readlnOrNull()
        if (name.isNullOrBlank()) break
            println("Hello $name")
    } while (true)
}

fun main() {
    greetUsers()
}
