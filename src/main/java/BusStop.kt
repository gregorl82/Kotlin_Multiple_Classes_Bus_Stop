class BusStop (name: String) {

    val name: String = name
    var queue: ArrayList<Person> = ArrayList()

    fun countQueue(): Int {
        return queue.size
    }

    fun addPersonToQueue(person: Person) {
        queue.add(person)
    }
}