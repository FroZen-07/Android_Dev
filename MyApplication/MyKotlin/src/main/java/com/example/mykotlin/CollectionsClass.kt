package com.example.mykotlin

fun main() {

    val myListOfName = listOf("James", "Paul", "Rafael", "Gina")
//    println(myListOfName)
    val found = myListOfName.filter{
        it.length > 4
    }
    println(found)

    // mutable
    val myMutableList = mutableListOf(12, 34, 45, 123)

//  Unique Value
    val mySet = setOf("US", "MZ", "AU")
    val myMutableSet = mutableSetOf(1,2,3,4,5)
    myMutableSet.add(34)
    println(myMutableSet)

//    Map
    val myMap = mapOf("Up" to 1, "Down" to 2)
    val myMutableMap = mutableMapOf("One" to 1, "Two" to 2)
    myMutableMap["Three"] = 3
    println(myMutableMap.values)

    val myNewList = mutableListOf<String>() // empty list
    myNewList.add("Bitan")

    val empty = emptyList<String>()
    val emptySet = emptySet<String>()
    val emptyMap = emptyMap<String, Int>()


//    myMutableList.add(214)
//    myMutableList.remove(214)
//    myMutableList.removeAt(0)
//
//    println("Number of elements ${myMutableList.size}")
//    println("Second element ${myMutableList[1]}") // .get(index)
//    println("Index of element \"45\" is ${myMutableList.indexOf(45)}")



//    println(myMutableList)

//    myListOfName.forEach {
//        println(it)
//    }

//    for (item in myListOfName){
//        println("Name : $item")
//    }
}

// List, ArrayList, listOf()
// Length/size -> no. of elements



