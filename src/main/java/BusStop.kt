class BusStop (name: String) {

    val name: String = name
    var queue: ArrayList<Person> = ArrayList()

    fun countQueue(): Int {
        return queue.size
    }

    fun addPersonToQueue(person: Person) {
        queue.add(person)
    }

    fun removePersonFromQueue(): Person {
        return queue.removeAt(0)
    }
}