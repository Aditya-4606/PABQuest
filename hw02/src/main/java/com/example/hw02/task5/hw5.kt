package com.example.hw02.task5
fun main() {
    print("Assignment score: ")
    val assignment = readln().toInt()
    // Read the exam score.
    print("Exam score: ")
    val exam = readln().toInt()
    // Compute the average as a Double.
    val average = (assignment+exam).toDouble()/2
    // Store the status with an if expression.
    var status = ""
    if(average>=60){
        status = "Pass"
    }
    else{
        status = "Needs improvement"
    }
    // Print the average and the status.
    println("Average: $average")
    println("Status: $status")
}