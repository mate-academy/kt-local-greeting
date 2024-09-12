package mate.academy

private const val TEXT = "Please enter a name (or press Enter to quit):"

fun greetUsers() {
    var name: String?
    do {
        println(TEXT)
        name = readlnOrNull()
        if (!name.isNullOrBlank()) {
            println("Hello $name")
        } else break
    } while (!name.isNullOrBlank())
}

fun main() {
    greetUsers()
}
