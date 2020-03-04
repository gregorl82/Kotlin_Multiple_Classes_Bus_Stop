import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PersonTest {

    val person = Person("Gregor")

    @Test
    fun getName() {
        assertEquals("Gregor", person.name)
    }
}