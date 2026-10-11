package com.example.hw04.task1
data class Product(
    val name: String,
    val price: Int
)
fun Product.isExpensive(): Boolean = price > 500000
fun main() {
    val product1 = Product("Mouse", 150000)
    val product2 = Product("Laptop", 7500000)
    println(product1)
    println(product2)
    val discountedLaptop = product2.copy(price = 4500000)
    println(discountedLaptop)
    println("${product1.name} is expensive? ${product1.isExpensive()}")
    println("${product2.name} is expensive? ${product2.isExpensive()}")
}