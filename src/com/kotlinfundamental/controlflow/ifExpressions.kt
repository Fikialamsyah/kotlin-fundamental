package com.kotlinfundamental.controlflow

fun main() {
    val a = 5
    val b = 3
    var aIsBigger = false

    // way 1
    if(a > b){
        aIsBigger = true
    } else {
        aIsBigger = false
    }

    // way 2
    val aIsBigger2 = if(a > b){
        true
    } else {
        false
    }

    // way 3
    val aIsBigger3 = if (a > b) true  else false
}