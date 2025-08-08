package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit): ")
        val name = readln()
        if (name.isEmpty()) {
            return
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
