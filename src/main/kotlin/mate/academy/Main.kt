package mate.academy

fun greetUsers() {
    // implement function
    print("Please enter a name (or press Enter to quit): ")
    val name: String? = readLine()
    println("Hello, $name!")

}

fun main() {
    greetUsers()
}
