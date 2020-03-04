import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BusTest {

    val bus = Bus("Buchanan Bus Station", 4)
    val person = Person("Gregor")

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
        assertEquals(4, bus.capacity)
    }

    @Test
    fun busStartsEmpty() {
        assertEquals(0, bus.countPassengers())
    }

    @Test
    fun canAddPassengerToBus() {
        bus.addPassenger(person)
        assertEquals(1, bus.countPassengers())
    }

    @Test
    fun cannotAddPassengerIfBusFull() {
        bus.addPassenger(person)
        bus.addPassenger(person)
        bus.addPassenger(person)
        bus.addPassenger(person)
        bus.addPassenger(person)
        assertEquals(4, bus.countPassengers())
    }

    @Test
    fun canRemovePassengerFromBus() {
        bus.addPassenger(person)
        bus.addPassenger(person)
        bus.addPassenger(person)
        bus.removePassenger()
        assertEquals(2, bus.countPassengers())
    }
}