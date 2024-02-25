package mate.academy

fun greetUsers() {
    fun askUserInput(): String? {
        println("Please enter a name (or press Enter to quit):")
        return readline()
    }

    fun printGreeting(name: String?) {
        println("Hello, $name!")

    }

    var name = askUserInput()
    while (name) {
        printGreeting(name)
        name = askUserInput()
    }
}

fun main() {
    greetUsers()
}
