package mate.academy

fun greetUsers() {
    // implement function
    println("Please enter a name (or press Enter to quit):")
    var name = readln()
    if (name.isBlank()) return
    println("Hello, $name!")
}

fun main() {
    greetUsers()
}
