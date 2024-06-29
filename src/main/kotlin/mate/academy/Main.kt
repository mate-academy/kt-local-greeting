package mate.academy

fun greetUsers() {
   var nameHere: Boolean = true
    do {
        println("Please enter a name (or press Enter to quit):")
        val name: String? = readLine()
        if (!name.isNullOrEmpty()) {
            println("Hello, $name!")
        } else {
            nameHere = false
        }
    } while (nameHere)
}

fun main() {
    greetUsers()
}
