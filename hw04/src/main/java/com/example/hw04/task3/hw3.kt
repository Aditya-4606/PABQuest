package com.example.hw04.task3
enum class CourseStatus { ACTIVE, COMPLETED }
data class Course(
    val code: String,
    val name: String,
    val status: CourseStatus)
fun Course.displayInfo(): String = "$code - $name - $status"

fun main() {
    val courses = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("WEB202", "Web Programming", CourseStatus.COMPLETED)
    )

    courses.add(Course("PG404", "Game Development", CourseStatus.ACTIVE))
    courses.removeAt(1)

    println("Remaining Courses:")
    for (course in courses) {
        println(course.displayInfo())
    }

    val sampleCourse = courses[0]
    val (code, name, status) = sampleCourse
    println("\nDestructured Course -> Code: $code, Name: $name, Status: $status")
}