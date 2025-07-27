package mate.academy

fun greetUsers() {
    var response: String

    do {
        println("Please enter a name (or press Enter to quit):");
        response = readln()

        if (!response.isEmpty()) {
            println("Hello, $response!")
        }
    } while (!response.isEmpty())
}

fun main() {
    greetUsers()
}
