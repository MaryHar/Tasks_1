fun main(args: Array<String>){
    printValueGenerifined( 37)
    printValueGenerifined( 45)
    printValueGenerifined( "37")
}
fun<T> printValueGenerifined(value: T){
    println("Description: $value")
}

class Generic <T>(private var value: T){
    fun setValue(t: T){
        value = t
    }
    fun getValue() = value

    fun printValue(){
        println("This is my value: $value")
}
}
open class Animal
class Tiger:Animal()
class Lion:Animal()