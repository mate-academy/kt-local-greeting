package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    var name = readLine() ?: ""

    while (name.isNotEmpty()) {
        println("Hello, $name!")
        println("Please enter a name (or press Enter to quit):")
        name = readLine() ?: ""
    }
}

fun main() {
    greetUsers()
}
