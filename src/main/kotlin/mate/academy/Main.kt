package mate.academy

fun greetUsers() {
    // implement function
    var inputName = "";
    do {
        println("Please enter a name (or press Enter to quit):")
        inputName = readln()
        if (!inputName.isEmpty()) {
            println("Hello, $inputName!")
        }
    } while (!inputName.isEmpty())
}

fun main() {
    greetUsers()
}
