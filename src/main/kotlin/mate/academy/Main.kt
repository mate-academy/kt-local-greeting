package mate.academy

fun main() {
    greetUsers()
}

fun greetUsers() {
    var flag = true
    while (flag) {
        println("Please enter a name (or press Enter to quit): ")
        val name : String? = readLine()
        if (name == "") {
            flag = false
            continue
        }
        println("Hello, $name!")
    }
}
