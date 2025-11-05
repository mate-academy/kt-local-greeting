package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class GreetUsersTest {

    @Test
    fun `should stop when name is empty`() {
        val names = listOf("Bob", "Alice", "")
        val greetings = mutableListOf<String>()

        for (name in names) {
            if (name.isEmpty()) break
            greetings.add("Hello, $name!")
        }

        assertEquals(listOf("Hello, Bob!", "Hello, Alice!"), greetings)
    }

    @Test
    fun `should greet multiple users until empty input`() {
        val input = listOf("John", "Mia", "")
        val output = mutableListOf<String>()

        for (name in input) {
            if (name.isEmpty()) break
            output.add("Hello, $name!")
        }

        assertEquals(2, output.size)
        assertTrue(output.contains("Hello, John!"))
        assertTrue(output.contains("Hello, Mia!"))
    }
}
