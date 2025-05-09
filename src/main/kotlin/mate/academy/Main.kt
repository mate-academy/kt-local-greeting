package mate.academy

fun greetUsers() {
    fun askAndGreet() {
        while (true) {
            println("Please enter a name (or press Enter to quit): ")
            val name = readln()
            if (name.isEmpty()) return else println("Hello, $name!")
        }
    }
    askAndGreet()
}

fun main() {
    greetUsers()
}
