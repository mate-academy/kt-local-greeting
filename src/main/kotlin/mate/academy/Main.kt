package mate.academy

fun main() {
    fun greetUsers() {
        while (true) {
            println("Please enter a name (or press Enter to quit): ")
            val input = readLine()
            if (input.isNullOrBlank()) {
                break
            }
            println("Hello, ${input}!")
        }
    }
    greetUsers()
}
