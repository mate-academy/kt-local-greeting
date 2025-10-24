package mate.academy

fun greetUsers() {
    fun greet(name: String) {
        println("Hello, $name!")
    }

    while (true) {
        print("Please enter a name (or press Enter to quit): \n")
        val name = readLine()?.trim().orEmpty()
        if (name.isEmpty()) break
        greet(name)
    }
}

fun main() {
    greetUsers()
}
