package mate.academy

import kotlin.system.exitProcess

fun greetUsers() {
    println("Please enter a name (or press Enter to quit): ")
    val str: String = readln()

    if (str.isEmpty()) {
        exitProcess(0)
    } else {
        println("Hello, $str!")
        greetUsers()
    }
}

fun main() {
    greetUsers()
}
