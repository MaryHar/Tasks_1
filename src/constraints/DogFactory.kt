package constraints

import constraints.Dog
import constraints.Labrador
import constraints.Husky

class DogFactory {
    companion object {
        fun createDog(breed: String): Dog {
            return when (breed) {
                "Labrador" -> Labrador()
                "Husky" -> Husky()
                else -> throw IllegalArgumentException("Unknown dog breed")
            }
        }
    }
}