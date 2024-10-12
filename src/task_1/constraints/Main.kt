/*Constraints: Try using factory pattern for object creation and make sure that the place (e.g. main() function) where we create the concrete (inherited) object is not visible - (hint: you need to use different packages and access modifiers - protected, private etc.)*/
package task_1.constraints

fun main() {
    val dog1: Dog = DogFactory.createDog("Labrador")
    dog1.bark()

    val dog2: Dog = DogFactory.createDog("Husky")
    dog2.bark()
}