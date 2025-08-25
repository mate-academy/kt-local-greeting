package mate.academy

fun greetUsers() {
    while (true) {
        print("Please enter a name (or press Enter to quit): ")
        val name = readLine()?.trim() ?: ""
        if (name.isEmpty()) {
            break
        }
        println("Hello, $name!")
        // implement function
    }
}

fun main() {
    greetUsers()
}
