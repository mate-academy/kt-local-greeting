package mate.academy

fun greetUsers() {
    fun askName(): String? {
        print("Please enter a name (or press Enter to quit): ")
        return readLine()
    }

    var name = askName()
    while (!name.isNullOrEmpty()) {
        println("Hello, $name!")
        name = askName()
    }
}
