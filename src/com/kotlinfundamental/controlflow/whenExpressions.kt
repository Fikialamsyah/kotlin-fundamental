package com.kotlinfundamental.controlflow

fun main() {
    val cardInt = 11
    when(cardInt){
        11 -> "Jack"
        12 -> "Queen"
        13 -> "King"
    }

    val cardName = when(cardInt){
        11 -> "Jack"
        12 -> "Queen"
        13 -> "King"
        else -> "Other"
    }
}