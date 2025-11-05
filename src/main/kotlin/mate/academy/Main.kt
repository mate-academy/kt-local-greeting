package mate.academy

fun greetUsers() {
    fun askName(): String? {
        print("Please enter a name (or press Enter to quit): ")
        return readLine()
    }

    while (true) {
        val name = askName() ?: break
        if (name.isEmpty()) {
            break
        }
        println("Hello, $name!")
    }
}
