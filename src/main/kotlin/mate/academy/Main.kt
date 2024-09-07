package mate.academy

fun greetUsers() {
    // implement function
    var inputName = ""
    do {
        println("Please enter a name (or press Enter to quit):")
        inputName = readln()
        if (inputName.isNotEmpty()) {
            println("Hello, $inputName!")
        }
    } while (inputName.isNotEmpty())
}

fun main() {
    greetUsers()
}
