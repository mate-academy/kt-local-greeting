package mate.academy

const val TEXT = "Please enter a name (or press Enter to quit):"
const val ANSWER = "Hello, "
const val EXIT_LINE = ""

fun greetUsers() {
    var line : String? = null
    while (line != EXIT_LINE) {
        println(TEXT)
        line = readlnOrNull()
        println("$ANSWER$line")
    }
}

fun main() {
    greetUsers()
}
