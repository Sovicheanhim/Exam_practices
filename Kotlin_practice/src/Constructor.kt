fun main(args: Array<String>) {
    val obj = Person("vichea", 18)
}

class Person(firstName: String, age:Int){
    init {
        println("Name : ${firstName.capitalize()}")
        println("Age: $age")
    }
}