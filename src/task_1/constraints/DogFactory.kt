package task_1.constraints

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