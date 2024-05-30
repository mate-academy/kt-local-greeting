package mate.academy

const val OPTION_MESSAGE: String = "Please enter a name (or press Enter to quit): "
const val HELLO_MESSAGE: String = "Hello, "

fun greetUsers() {
    var userInput: String
    do {
        print(OPTION_MESSAGE)
        userInput = readln()
        if (userInput.isNotEmpty()) {
            println("$HELLO_MESSAGE $userInput!")
        }
    } while (userInput.isNotEmpty())
}

fun main() {
    greetUsers()
}
