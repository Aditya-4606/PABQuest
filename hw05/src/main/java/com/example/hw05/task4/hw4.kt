package com.example.hw05.task4
data class Config(var host: String = "", var port: Int = 0, var debug: Boolean = false)

fun main(){
    //1. apply
    val config = Config().apply {
        host = "localhost"
        port = 8080
        debug = true
    }
    println(config)
    //2. let
    val name: String? = "Rina"
    name?.let {
        println(it.uppercase())
    }
    //3. mutableList<Int>
    val numbers = mutableListOf(1, 2, 3)
        .also { println("Before: $it") }
        .apply { add(4) }
        .also { println("After: $it") }
}
