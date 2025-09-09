package mate.academy

fun main() {
    fun greetUsers() {
        // implement function
        while (true) {
            print("Please enter a name (or press Enter to quit): ")
            val name = readln()
            if (name.isEmpty()) return else println("Hello, $name!")
        }
    }
    greetUsers()
}
