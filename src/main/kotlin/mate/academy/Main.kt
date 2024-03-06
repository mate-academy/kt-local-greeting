package mate.academy

fun greetUsers() {

    while (true) {
        print("Please enter a name (or press Enter to quit): ")
        val name = readLine()
        if (!name.equals("")) {
            println("Hello, $name!")
        }
        break
    }


    fun main() {
        greetUsers()
    }
}

