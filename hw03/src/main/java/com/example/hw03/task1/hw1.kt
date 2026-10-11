package com.example.hw03.task1
// Step 1: Parent
open class SmartDevice(val name: String) {
    var status = "off"
    open fun turnOn() {
        status = "on"
        println("$name is ON")
    }
    open fun turnOff() {
        status = "off"
        println("$name is OFF")
    }
}
// Step 2: Child
open class SmartLightDevice(name: String) : SmartDevice(name) {
    var brightness = 50
    override fun turnOn(){
        super.turnOn()
        println("Brigntness: $brightness")
    }
}
fun main() {
    val device = SmartLightDevice("Desk Lamp")
    device.turnOn()
    println("Status: ${device.status}")
    device.turnOff()
}