package mate.academy

fun greetUsers() {
    var name: String? = null;
    while (name?.isBlank() ?: true) {
        println("Please enter a name (or press Enter to quit):")
        name = readln()
    }
    println("Hello, $name!")
}

fun main() {
    greetUsers()
}
