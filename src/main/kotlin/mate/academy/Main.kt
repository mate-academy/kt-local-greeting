package mate.academy

fun greetUsers() {
    while (true) {
        print("Please enter a name (or press Enter to quit): ")
        val answer = readln()
        print("Hello, $answer!\n")
    }

}

fun main() {
    greetUsers()
}
