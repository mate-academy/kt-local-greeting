package mate.academy

fun greetUsers() {
    var name: String

    do {
        println("Please enter a name (or press Enter to quit):")

        name = readln()

        if (name.isNotEmpty()) {
            println("Hello, $name!")
        }
    } while (name.isNotEmpty())
}

fun main() {
    greetUsers()
}
