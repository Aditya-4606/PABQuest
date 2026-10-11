package com.example.hw03.task2
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
open class SmartTvDevice(name: String) : SmartDevice(name){
    var speakerVolume = 5
    var channelNumber = 1
    override fun turnOn() {
        super.turnOn()
        println("TV: display on")
    }
    fun increaseVolume(){
        speakerVolume = speakerVolume+1
        println("Volume: $speakerVolume")
    }
    fun nextChannel(){
        channelNumber = channelNumber+1
        println("Channel: $channelNumber")
    }
}
fun main() {
    val device = SmartTvDevice("Living Room TV")
    device.turnOn()
    device.nextChannel()
    device.increaseVolume()
    device.turnOff()
}