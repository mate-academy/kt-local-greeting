package mate.academy

private const val STOP_STRING = ""

fun main() {
    greetUsers()
}

fun greetUsers() {
    fun printGreeting(name: String?) {
        println("Hello, $name!")
    }

    fun askUserInput(): String? {
        println("Please enter a name (or press Enter to quit):")
        return readLine()
    }

    var name = askUserInput()
    while (name != STOP_STRING) {
        askUserInput()
        printGreeting(name)
    }
}
