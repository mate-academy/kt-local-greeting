package mate.academy

fun greetUsers() {
    while (true) {
        print("Enter a name (or press Enter to finish): ")
        val name = readLine()
        if (name.isNullOrEmpty()) {
            break
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
