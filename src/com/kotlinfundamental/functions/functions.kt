package com.kotlinfundamental.functions

fun printJack(){
    println("Jack")
}

// with parameter
fun printJackParam(cardName: String, cardValue : Int){
    println("$cardName = $cardValue")
}

// with return value
fun getCardString(cardName: String, cardValue: Int) : String{
    return("$cardName = $cardValue")
}

// another way
fun getCardString2(cardName: String, cardValue: Int): String = "$cardName = $cardValue"