package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        var input = readLine()
        if (input == "") {
            return
        }
        println("Hello, $input!")
    }
}

fun main() {
    greetUsers()
}
