package mate.academy

import kotlin.system.exitProcess

fun greetUsers() {
    println("Please enter a name (or press Enter to quit): ")
    val input = readLine()
    if (input == " " || input == "") {
        exitProcess(0)
    } else {
        println("Hello, $input!")
    }
}

fun main() {
    greetUsers()
}
