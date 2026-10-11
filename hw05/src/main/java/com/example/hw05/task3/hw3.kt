package com.example.hw05.task3
data class Student(
    val name: String,
    val score: Int,
    val year: Int
)
val students = listOf(
    Student("Ali",   85, 2023),
    Student("Budi",  62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi",  58, 2022),
    Student("Eka",   76, 2023)
)
fun main() {
    // 1. filter
    val highScorersCount = students.filter { it.score >= 70 }.count()
    println("1. Students with score >= 70: $highScorersCount")
    // 2. map
    println("2. Formatted student list:")
    students.map { "${it.name} (${it.score})" }.forEach { println(it) }
    // 3. sortedByDescending
    val topThreeNames = students.sortedByDescending { it.score }.take(3).map { it.name }
    println("3. Top three names by score: $topThreeNames")
    // 4. fold
    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val classAverage: Double = totalScore.toDouble() / students.size
    println("4. Total Score: $totalScore, Class Average: $classAverage")
    // 5. groupBy
    println("5. Students grouped by year:")
    students.groupBy { it.year }.forEach { (year, group) ->
        val names = group.map { it.name }
        println("$year: $names")
    }
}