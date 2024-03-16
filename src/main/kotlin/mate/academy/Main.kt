package mate.academy

const val GREETING = "Please enter a name (or press Enter to quit): "

fun greetUsers() {
    var userName: String
    while (true) {
        println(GREETING)
        userName = readlnOrNull().toString()
        if (userName == "") break else println("Hello, $userName!")
    }
}

fun main() {
    greetUsers()
}
