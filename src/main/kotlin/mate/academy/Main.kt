package mate.academy

fun greetUsers() {
    while(true) {
        println("Please enter a name (or press Enter to quit):")
        val string = readln()
        if (string == "") break
        println("Hello, $string!")
    }
}

fun main() {
    greetUsers()
}
