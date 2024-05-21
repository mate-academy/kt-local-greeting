package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val name: String? = readlnOrNull()
    if (name == "")
        return
    else
        println("Hello, $name!")
    greetUsers()
}

fun main() {
    greetUsers()
}
