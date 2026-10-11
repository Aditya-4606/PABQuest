package com.example.hw02.task2
fun main() {
    //Part A
    val daysRemaining = 2
    // Use if, else if, and else.
    if(daysRemaining<0){
        println("Overdue")
    }
    else if(daysRemaining==0){
        println("Due Today")
    }
    else{
        println("Upcoming")
    }

    //Part B
    println("-----")
    val monthName = 9
    when(monthName){
        1 -> println("Month $monthName: January")
        2 -> println("Month $monthName: February")
        3 -> println("Month $monthName: March")
        4 -> println("Month $monthName: April")
        5 -> println("Month $monthName: May")
        6 -> println("Month $monthName: June")
        7 -> println("Month $monthName: July")
        8 -> println("Month $monthName: August")
        9 -> println("Month $monthName: September")
        10 -> println("Month $monthName: October")
        11 -> println("Month $monthName: November")
        12 -> println("Month $monthName: December")
        else -> println("Month $monthName: Invalid month")
    }
}