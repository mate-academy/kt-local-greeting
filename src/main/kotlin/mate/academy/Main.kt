package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit): ")
        val usersName = readlnOrNull()
        if (usersName.isNullOrEmpty()) {
            break
        }
        println("Hello, $usersName!")
    }
}

fun main() {
    greetUsers()
}
