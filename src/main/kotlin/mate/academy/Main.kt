package mate.academy

import kotlin.system.exitProcess

fun greetUsers() {
    println("Please enter a name (or press Enter to quit): ")
    val input = readlnOrNull()
    if (input === " " || input === "") {
        return
    } else {
        println("Hello, $input!")
    }
}

fun main() {
    greetUsers()
}
