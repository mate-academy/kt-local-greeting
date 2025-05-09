package mate.academy

import java.util.*

fun greetUsers() {
    val scanner = Scanner(System.`in`)
    while (true) {
    println("Please enter a name (or press Enter to quit): ")
    val name = scanner.nextLine()
        if (name.isNotEmpty()) {
            println("Hello, $name!")
        } else {
            break
        }
    }
}

fun main() {
    greetUsers()
}
