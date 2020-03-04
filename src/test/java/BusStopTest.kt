import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BusStopTest {

    val busStop = BusStop("Buchanan Bus Station")
    val person = Person("John")

    @Test
    fun getName() {
        assertEquals("Buchanan Bus Station", busStop.name)
    }

    @Test
    fun queueStartsEmpty() {
        assertEquals(0, busStop.countQueue())
    }

    @Test
    fun addPersonToQueue() {
        busStop.addPersonToQueue(person)
        assertEquals(1, busStop.countQueue())
    }

    @Test
    fun removePersonFromQueue() {
        busStop.addPersonToQueue(person)
        busStop.addPersonToQueue(person)
        val removedPassenger: Person = busStop.removePersonFromQueue()
        assertEquals(1, busStop.countQueue())
        assertEquals(person, removedPassenger)
    }
}