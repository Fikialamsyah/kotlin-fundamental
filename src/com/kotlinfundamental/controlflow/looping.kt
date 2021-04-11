package com.kotlinfundamental.controlflow

fun main() {
    val cardList = mutableListOf("Jack", "Queen", "King")

    // looping for loop to cardList
    for(card in cardList){
        println(card)
    }

    // looping over a range of numbers
    for(i in 1..10){
        println(i)
    }

    // looping down from 10 to 1
    for(i in 10 downTo 1){
        println(i)
    }

    // looping for to cardMap
    val cardMap = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    for((name, value) in cardMap){
        print("$name, $value")
    }

}