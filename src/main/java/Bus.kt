class Bus (destination: String, capacity: Int) {

    var destination: String = destination
    val capacity: Int = capacity
    var passengers: ArrayList<Person> = ArrayList()

    fun countPassengers(): Int {
        return passengers.size
    }

    fun addPassenger(person: Person) {
        if (countPassengers() < capacity) {
            passengers.add(person)
        }
    }

    fun removePassenger() {
        passengers.removeAt(0)
    }
}