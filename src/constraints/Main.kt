package constraints

import constraints.DogFactory
import constraints.Dog

fun main() {
    val dog1: Dog = DogFactory.createDog("Labrador")
    dog1.bark()

    val dog2: Dog = DogFactory.createDog("Husky")
    dog2.bark()
}