package com.example.mykotlin

fun main() {
    val car = Car(color = "Green", model = "LLm")
//    val car2 = Car(color = "Red", model = "LLm2")

    println(car.color)
    println(car.model)
    car.speed(30, 90)
    car.drive()
}

class Car(var color: String, val model: String) {
//    var color: String = color
//    var model: String = model

//    init {
//        color = "Yellow"
//        model = "xxd"
//    }

    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Speed Range from $minSpeed to $maxSpeed")
    }


    fun drive() {
        println("Driving....")
    }
}

