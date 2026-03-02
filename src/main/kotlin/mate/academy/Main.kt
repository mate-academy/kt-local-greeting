package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit):")
    val name = readLine()
    if (name != "") {
        println("Hello, $name!")
        greetUsers()
    } else {
        return
    }
}

fun main() {
    greetUsers()
}
