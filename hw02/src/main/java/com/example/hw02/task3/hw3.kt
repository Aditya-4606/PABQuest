package com.example.hw02.task3
fun main() {
    //Part A
    val numberOfDays = 5
    // Write your loop here.
    for(i in 1..numberOfDays){
        println("Day $i: Study for 20 minutes")
    }

    //part B
    println("-----")
    for(i in 1..numberOfDays step 2){
        println("Day $i: Study for 20 minutes")
    }
}