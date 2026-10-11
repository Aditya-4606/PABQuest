package com.example.hw04.task2
fun main() {
    val cart = mutableListOf("Laptop", "Mouse")

    // 1. Add "keyboard" and "Headset"
    cart.add("Keyboard")
    cart.add("Headset")

    // 2. Remove "Mouse"
    cart.remove("Mouse")

    // 3. Print every product using a loop
    println("Products in cart:")
    for (item in cart) {
        println("- $item")
    }

    // 4. Print the number of products
    println("Total products: ${cart.size}")
}