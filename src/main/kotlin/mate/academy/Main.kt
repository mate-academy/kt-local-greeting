package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    var name = readLine()
    if (name == "") return else println("Hello, $name!")
}

fun main() {
    greetUsers()
}
