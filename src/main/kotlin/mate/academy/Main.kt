package mate.academy

fun greetUsers() {
   while (true) {
        print("Please enter your name: ")
        val name = readLine() ?: ""

        if (name.isEmpty()) {
            break
        }

        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
