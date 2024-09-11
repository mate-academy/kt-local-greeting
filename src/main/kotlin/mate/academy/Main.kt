package mate.academy

const val TEXT = "Please enter a name (or press Enter to quit):"

fun greetUsers() {
    var name: String?
    do {
        println(TEXT)
        name = readLine()
        if (!name.isNullOrEmpty()) println("Hello $name")
    } while (!name.isNullOrEmpty())

}

fun main() {
    greetUsers()
}
