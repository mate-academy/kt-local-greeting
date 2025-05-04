package mate.academy

fun greetUsers(name: String) = "Hello, ${name}!"

fun main() {
    var name = ""
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        name = readlnOrNull().toString()
        if (name.isEmpty()) break
        greetUsers(name)
    }
}
