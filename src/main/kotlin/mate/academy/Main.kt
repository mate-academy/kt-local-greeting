package mate.academy

fun greetUsers() {
    fun greet(name: String) {
        println("Hello, $name!")
    }
    while (true) {
        print("Please enter a name (or press Enter to quit): ")
        val name = readLine()

        if (name.isNullOrBlank()) {
            break
        }

        greet(name)
    }
}

fun main() {
    greetUsers()

}
