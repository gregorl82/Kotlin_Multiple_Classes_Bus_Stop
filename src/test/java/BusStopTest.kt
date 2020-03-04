import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BusStopTest {

    val busStop = BusStop("Buchanan Bus Station")

    @Test
    fun getName() {
        assertEquals("Buchanan Bus Station", busStop.name)
    }

    @Test
    fun queueStartsEmpty() {
        assertEquals(0, busStop.countQueue())
    }
}