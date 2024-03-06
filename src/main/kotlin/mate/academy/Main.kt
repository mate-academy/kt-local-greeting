package mate.academy

fun greetUsers() {
    while(true) {
        println("Please enter a name (or press Enter to quit): ")
        val name = readLine()
        if (name?.length == 0) {
            return
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
