package mate.academy

fun greetUsers() {
    var name: String
    do {
        println("Please enter a name (or press Enter to quit):")
        name = readln()
        if (name == "") {
            break
        }
        println("Hello, $name!")
    } while (true)
}

fun main() {
    greetUsers()
}
