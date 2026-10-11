package com.example.hw05.task5
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
fun main(){
    //1. Partition
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}    Failing: ${failing.size}")
    //2. Highest-scoring
    students.maxByOrNull { it.score }?.let {
        println("Top scorer : ${it.name} (${it.score})")
    }
    students.minByOrNull { it.score }?.let {
        println("Low scorer : ${it.name} (${it.score})")
    }
    //3. Average
    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val averageScore = totalScore.toDouble() / students.size
    println("Class average: %.1f".format(averageScore))
    //4. Formatted summary
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { student ->
            val status = if (student.score >= 70) "PASS" else "FAIL"
            appendLine("${student.name.padEnd(8)} ${student.score.toString().padStart(3)}   $status")
        }
    }
    print(report)
}