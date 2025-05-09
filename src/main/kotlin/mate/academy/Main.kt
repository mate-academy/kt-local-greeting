package mate.academy

fun greetUsers() {
    fun getName(): String {
        println("Please enter a name (or press Enter to quit): ")
        return readlnOrNull().orEmpty()
    }

    while (true) {
        val name = getName()
        if (name.isBlank()) break
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
