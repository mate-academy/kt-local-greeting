package mate.academy

fun greetUsers() {
    fun greet(name: String) {
        println("Hello, $name!")
    }
    while(true) {
        print("Please enter a name (or press Enter to quit): ")
        val input = readLine()?.trim() ?:""

        if (input.isEmpty()) {
                break
    }

        greet(input)
    }
}

fun main() {
    greetUsers()
}
