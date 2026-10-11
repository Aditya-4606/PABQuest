package com.example.hw05.task1
fun main(){
    //1. Lambda that doubles an Int
    val double: (Int) -> Int = {it*2}
    println(double(7))
    //2. Lambda that checks whether a String starts with a vowel
    val startsWithVowel: (String) -> Boolean = {str ->
        val firstChar = str.firstOrNull()?.lowercaseChar()
        firstChar in setOf('a','i','u','e','o')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))
    //3. Lambda that takes two Int values and return the larger one.
    val largerOne: (Int, Int) -> Int = {a,b -> if(a>b) a else b}
    println(largerOne(12, 7))
}