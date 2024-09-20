package mate.academy

fun greetUsers() {
    println("Please enter a name (or press Enter to quit")
    var username : String? = readLine()
    if (username == null) return else "Hello, $username!"
}

fun main() {
    greetUsers()
}
