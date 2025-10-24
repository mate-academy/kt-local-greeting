package mate.academy

fun main() {
    fun greetUsers() {
        fun greet(name: String) {
            println("Hello, $name!")
        }

        while (true) {
            println("Please enter a name (or press Enter to quit):")
            val name = readLine()?.trim().orEmpty()
            if (name.isEmpty()) break
            greet(name)
        }
    }

    greetUsers()
}
