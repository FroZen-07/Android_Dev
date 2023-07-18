package com.example.mykotlin

fun main() {
//    calculate(1,100, 3, "is multiple of")
//    calculate(divide = 3, message = "is multiple")
    val catAge = calculateCatAge(7)
//    checkAge(catAge)
    println(checkAge(catAge))
}


fun calculateCatAge(age: Int): Int = age * 7
fun checkAge(catAge: Int) : Boolean {
    return catAge > 14
}


fun calculate(first: Int = 1, second: Int = 50, divide: Int, message: String) {
    for(i in first..second){
        if(i % divide == 0){
            println("$i $message $divide")
        }
    }
}

