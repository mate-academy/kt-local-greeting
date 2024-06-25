package mate.academy

import java.util.Scanner

fun greetUsers() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Please enter a name (or press Enter to quit): ")
        val nextLine = scanner.nextLine()
        if (nextLine.isEmpty()) break
        println("Hello, $nextLine!")
    }
}

fun main() {
    greetUsers()
}
