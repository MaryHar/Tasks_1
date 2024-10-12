package task_1.task_1_1

/*OOP - Create a program using inheritance, polymorphism and encapsulation */
// Base class
open class Dog(private val name: String) {

    open fun speak(): String {
        throw NotImplementedError("Subclass must implement abstract method")
    }

    fun getName(): String {
        return name // Encapsulation: access to private attribute
    }
}

// Derived class: Bulldog
class Bulldog(name: String) : Dog(name) {
    override fun speak(): String {
        return "${getName()} says Woof! I'm a Bulldog!" // Polymorphism
    }
}

// Derived class: Beagle
class Beagle(name: String) : Dog(name) {
    override fun speak(): String {
        return "${getName()} says Woof! I'm a Beagle!" // Polymorphism
    }
}

// Derived class: Poodle
class Poodle(name: String) : Dog(name) {
    override fun speak(): String {
        return "${getName()} says Woof! I'm a Poodle!" // Polymorphism
    }
}

fun main() {
    // Instantiate the dog types
    val bulldog = Bulldog("Jimi")
    val beagle = Beagle("Archy")
    val poodle = Poodle("Mimi")

    // Use polymorphism to call speak method on different dog types
    val dogs: List<Dog> = listOf(bulldog, beagle, poodle)
    for (dog in dogs) {
        println(dog.speak())
    }
}
