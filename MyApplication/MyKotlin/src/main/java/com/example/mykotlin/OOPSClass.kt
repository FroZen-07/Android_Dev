package com.example.mykotlin

fun main() {
    val car = Car(color = "Green", model = "LLm")
//    val car2 = Car(color = "Red", model = "LLm2")

//    println(car.color)
//    println(car.model)
//    car.speed(30, 90)
//    car.drive()


//    val truck = Truck("Magenta", "F16")
//    truck.speed(20,90)
//    truck.drive()

//    val button = Button(label = "Button")
//    button.onClick("This is a message")
//
//    val superMario = Character("Super Mario")
//    superMario.onClick("Hi, I'm Mario")

//    println("Hello Bitan ".append("Atarthy"))
//    println("Bitan Atarthy".removeFirstAndLastChars())

    val person = Person(
        name = "Bitan",
        lastName = "Atarthy",
        age = 22
    )
    println(person)


}

data class Person(val name: String, val lastName: String, val age: Int)


//Extension Functions
fun String.append(toAppend: String): String = this.plus(toAppend)
fun String.removeFirstAndLastChars(): String = this.substring(1, this.length - 1)


class Button(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $label and here's a message $message")
    }


}

class Character(val name: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here's a message $message")
    }

}

//Interface
interface ClickEvent {
    fun onClick(message: String)
}


class Truck(color: String, model: String) : Car(color, model) {
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed * maxSpeed
        println("Truck full speed: $fullSpeed")

    }

    override fun drive() {
        println("Vroommm... Like a truck!!!")
    }

}


open class Car (var color: String ,
                val model: String) {

//    init {
//        if (color == "Green") {
//
//            println("Yay Green")
//        }else {
//            println("$color is not Green")
//
//        }
//
//    }

    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed and MaxSpeed: $maxSpeed")
    }
    open fun drive() {
        println("Drive...vroommmm")
    }
}

