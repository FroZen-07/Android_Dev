package com.example.mykotlin

fun main() {
    println(sum(12,13))
    println(calculateCatAge(3))
    showName("Bitan")
}

val sum: (Int, Int) -> Int = {
    a,b -> a + b
}

val showName : (String) -> Unit = { println(it) }

val calculateCatAge: (Int) -> Int = {it * 7}


