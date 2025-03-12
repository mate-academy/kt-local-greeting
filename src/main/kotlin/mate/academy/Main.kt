package mate.academy

const val WELCOME_USER = "Please enter a name (or press Enter to quit):"

fun greetUsers() {
    while (true) {
        println(WELCOME_USER)

        val name = readLine()

        if (name.isNullOrBlank()) {
            break
        }

        println("Hello ${name}")
    }

}

fun main() {
    greetUsers()
}
