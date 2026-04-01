package mate.academy

fun main() {
    fun greetUsers() {
        while (true) {
            print("Please enter a name (or press Enter to quit): ")
            val name = readLine() ?: ""
            if (name.isEmpty()) break
            println("Hello, $name!")
        }
    }

    greetUsers()
}
