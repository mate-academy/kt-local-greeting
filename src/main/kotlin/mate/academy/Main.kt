package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val input = readLine()
        if (input.isNullOrEmpty()) break
        println("Hello, $input")
    }
}

fun main() {
    greetUsers()
}
