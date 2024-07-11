package mate.academy

const val GREETING_TEXT = "Please enter a name (or press Enter to quit):"

fun greetUsers() {
    fun greetingText() : String = GREETING_TEXT
    fun readInput() : String? = readLine()
    fun checkResponse (readInput : String?) {
        if (!readInput.isNullOrBlank()) {
            println("Hello, $readInput!")
            greetUsers()
        }
    }

    println(greetingText())
    checkResponse(readInput())

}

fun main() {
    greetUsers()
}
