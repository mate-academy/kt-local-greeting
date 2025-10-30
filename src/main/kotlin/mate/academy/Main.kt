package mate.academy

fun greetUsers() {
    fun askName(): String? {
        print("Please enter a name (or press Enter to quit): ")
        return readLine()
    }

    while (true) {
        val name = askName()
        if (name.isNullOrEmpty()) {
            break
        }
        println("Hello, $name!")
    }
    // implement function
}

fun main() {
    greetUsers()
}

