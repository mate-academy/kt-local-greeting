package mate.academy

fun greetUsers() {
    fun greet(name: String) {
        println("Hello, $name!")
    }
    println("Please enter a name (or press Enter to quit): ")
    var name = readlnOrNull()?.trim() ?: ""
    while (name.isNotEmpty()) {
        greet(name = name)
        println("Please enter a name (or press Enter to quit): ")
        name = readlnOrNull()?.trim() ?: ""
    }
}

fun main() {
    greetUsers()
}
