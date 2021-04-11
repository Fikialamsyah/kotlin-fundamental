package com.kotlinfundamental.collection

fun main() {
    val cards = mutableListOf("Jack", "Queen", "King")

    // add item of list
    cards.add("Ace")

    // remove item of list
    cards.remove("Jack")

    // empty item of list
    cards.clear()

}