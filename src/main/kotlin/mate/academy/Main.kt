package mate.academy

fun main() {
    fun greetUsers() {
        while (true) {
            println("Please enter a name (or press Enter to quit):")
            val input = readLine() ?: return
            if (input.isEmpty()) {
                return
            }
            println("Hello, $input!")
        }
    }
    greetUsers()
}
