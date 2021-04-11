package com.kotlinfundamental.collection

fun main() {
    // create map
    val cards = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)

    // access item
    val jackValue = cards["Jack"]

    // add item
    val mutableCards = cards.toMutableMap()
    mutableCards["Ace"] = 1






}