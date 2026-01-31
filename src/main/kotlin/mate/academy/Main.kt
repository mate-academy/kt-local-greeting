package mate.academy

fun main() {
    fun greetUsers() {
        var name: String
        while (true) {
            println("Please enter a name (or press Enter to quit):")
            name = readln()
            if (name.isEmpty()) break
            println("Hello, $name!")
        }
    }
    greetUsers()
}
