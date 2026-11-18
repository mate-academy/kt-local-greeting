package mate.academy

fun main() {
    fun greetUsers() {
        print("Please enter a name (or press Enter to quit): ")
        val readLine = readLine()
        if (!readLine.isNullOrEmpty()) {
            println("Hello, $readLine!")
            greetUsers()
        }
    }
    greetUsers()
}
