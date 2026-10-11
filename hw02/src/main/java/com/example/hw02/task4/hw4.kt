package com.example.hw02.task4
fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int{
    val total = sessions*minutesPerSession
    return total
}
fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int{
    val total = courses*creditsPerCourse
    return total
}
fun main() {
    //Part A
    val total = calculateStudyMinutes(3, 25)
    println("Total study time: $total minutes")
    // Call it again with 4 and 30.
    println("Total study time: ${calculateStudyMinutes(4,30)} minutes")

    //Part B
    println("-----")
    val courses = 5
    val credits = 3
    for(i in 1..courses){
        val tcredits = calculateTotalCredits(i,credits)
        println("Courses: $i, total credits: $tcredits")
    }
}