package com.example.mykotlin

fun main() {
    enhancedMessage("Hello, Bitan"){
        sum2(12,11)
    }
}
fun add(a: Int, b: Int) : Int {
    return a + b
}

val sum2 : (Int, Int) -> Int = {a,b -> a + b}

fun enhancedMessage(message: String, funAsParameter: () -> Int) {
    println(message)
    print(funAsParameter())
}