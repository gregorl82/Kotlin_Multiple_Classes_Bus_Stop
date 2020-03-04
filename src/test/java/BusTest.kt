import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BusTest {

    val bus = Bus("Buchanan Bus Station", 4)
    val busStop = BusStop("Hope Street")
    val person1 = Person("Gregor")
    val person2 = Person("James")
    val person3 = Person("Moira")
    val person4 = Person("Dale")
    val person5 = Person("Alison")

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
        bus.addPassenger(person1)
        assertEquals(1, bus.countPassengers())
    }

    @Test
    fun cannotAddPassengerIfBusFull() {
        bus.addPassenger(person1)
        bus.addPassenger(person2)
        bus.addPassenger(person3)
        bus.addPassenger(person4)
        bus.addPassenger(person5)
        assertEquals(4, bus.countPassengers())
    }

    @Test
    fun canRemovePassengerFromBus() {
        bus.addPassenger(person1)
        bus.addPassenger(person2)
        bus.addPassenger(person3)
        bus.removePassenger()
        assertEquals(2, bus.countPassengers())
    }

    @Test
    fun canPickUpPassengerFromQueue() {
        busStop.addPersonToQueue(person1)
        busStop.addPersonToQueue(person2)
        busStop.addPersonToQueue(person3)
        bus.pickUp(busStop)
        assertEquals(1, bus.countPassengers())
        assertEquals(2, busStop.countQueue())
    }

    @Test
    fun cannotPickUpPassengerIfBusFull() {
        busStop.addPersonToQueue(person5)
        bus.addPassenger(person1)
        bus.addPassenger(person2)
        bus.addPassenger(person3)
        bus.addPassenger(person4)
        bus.pickUp(busStop)
        assertEquals(4, bus.countPassengers())
        assertEquals(1, busStop.countQueue())
    }
}