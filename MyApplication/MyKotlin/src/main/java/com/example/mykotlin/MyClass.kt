package com.example.mykotlin

fun main() {
//    var name = "Joe" mutable
    val name: String
    val age: Int // 32 bits
    // Byte : 8 bits
    // Short : 16 bits
    // Long : 64 bits
    val myByte: Byte = 120 // max +- 127
    val myShort: Short = 128

    val number = 1L // Long

    // Float : 32 bits
    // Double : 64 bits -> more precise

    val pi = 3.14 // Double by default
    val piF = 3.14f // Float


    age = 22
    name = "Joe" // immutable

//    print("Hello $name and age $age")

    // Operators
    val a = 23
    val b = 12

    println(a%b)


}