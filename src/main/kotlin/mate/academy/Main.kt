package mate.academy

fun main() {
    fun greetUsers() {
        println("Please enter a name (or press Enter to quit): ")
        while (true) {
            val name = readln()
            if (name.isEmpty()) {
                break
            }
            println("Hello, $name!")
        }
    }

    greetUsers()
}
