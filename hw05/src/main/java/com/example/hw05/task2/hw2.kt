package com.example.hw05.task2
val double: (Int) -> Int = {it*2}
val startsWithVowel: (String) -> Boolean = {str ->
    val firstChar = str.firstOrNull()?.lowercaseChar()
    firstChar in setOf('a','i','u','e','o')
}
fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}
//2. printIf function
fun printIf(items: List<String>, condition: (String) -> Boolean) {
    for (item in items) {
        if (condition(item)) {
            println(item)
        }
    }
}
//3. transform function
fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    val result = mutableListOf<String>()
    for (item in list) {
        result.add(mapper(item))
    }
    return result
}
fun main() {
    // --- Test Task 1 ---
    val doubleResult = applyTwice(3, double)
    println("applyTwice(3, double) = $doubleResult") // Output: 12[cite: 1]

    // --- Test Task 2 ---
    val courses = listOf("Algebra", "Biology", "Chemistry", "English", "Physics")
    println("\nCourses starting with a vowel:")
    printIf(courses, startsWithVowel)
    // Output: Algebra, English

    // --- Test Task 3 ---
    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { it -> (it * it).toString() }
    println("\nSquared strings: $squaredStrings") // Output: [4, 9, 16][cite: 1]
}