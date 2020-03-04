import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BusTest {

    val bus = Bus("Buchanan Bus Station", 10)

    @Test
    fun getDestination() {
        assertEquals("Buchanan Bus Station", bus.destination)
    }

    @Test
    fun setDestination() {
        bus.destination = "Falkirk"
        assertEquals("Falkirk", bus.destination)
    }

    @Test
    fun getCapacity() {
        assertEquals(10, bus.capacity)
    }

    @Test
    fun busStartsEmpty() {
        assertEquals(0, bus.passengers.size)
    }
}