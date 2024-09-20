package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit")
        var username : String? = readLine()
        if (username == null) {
            return;
        } else {
            println("Hello, $username")
        }
    }
}

fun main() {
    greetUsers()
}
