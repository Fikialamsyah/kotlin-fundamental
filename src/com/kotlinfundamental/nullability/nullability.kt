package com.kotlinfundamental.nullability

fun main() {
    // kotlin null handle
    val x : Int? = null
    val y : String? =  null

    val name : String? = null
    print(name?.length)
}