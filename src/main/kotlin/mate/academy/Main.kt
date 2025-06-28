package mate.academy

fun greetUsers() {
    fun askAndGreet() {
        while (true) {
            print("Please enter a name (or press Enter to quit): ")
            val userName = readLine()
            if (userName.isNullOrEmpty()) {
                break
            }
            println("Hello, $userName!")
        }
    }

    askAndGreet()
}

fun main() {
    greetUsers()
}
