package mate.academy

fun greetUsers() {
    fun askName(): String? {
        print("Please enter a name (or press Enter to quit): ")
        return readLine()
    }

    while (true) {
        val name = askName() ?: return
        if (name.isEmpty()) return
        println("Hello, $name!")
    }
}
