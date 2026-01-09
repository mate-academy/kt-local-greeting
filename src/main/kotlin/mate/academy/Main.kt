package mate.academy

fun greetUsers() {
    fun greet() {
        while (true) {
            print("Please enter a name (or press Enter to quit): ")
            val name = readln()
            if (name.isEmpty()) break
            println("Hello, $name!")
        }
    }

    greet()
}
fun main() {
    greetUsers()
}
