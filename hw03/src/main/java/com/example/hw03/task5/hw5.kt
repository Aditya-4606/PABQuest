package com.example.hw03.task5
abstract class SmartDevice(val name: String){
    abstract fun turnOn()
    fun showName() {
        println(name)
    }
}
interface Connectable{
    fun connect()
}
interface Rechargeable{
    fun charge()
}
class SmartWatch(name: String) : SmartDevice(name), Connectable, Rechargeable{
    private var battery: Int = 50
        set(value) {
            field = when {
                value < 0 -> 0
                value > 100 -> 100
                else -> value
            }
        }
    var ownerName: String? = null
    override fun turnOn() {
        println("$name is ON")
    }
    override fun connect() {
        println("$name connected to phone")
    }
    override fun charge() {
        battery += 20
        println("Battery: $battery%")
    }
    fun showOwner() {
        if (ownerName != null) {
            println("Owner: $ownerName")
        } else {
            println("Owner: Not set")
        }
    }
}
fun main() {
    val myWatch = SmartWatch("Galaxy Watch")
    myWatch.showName()
    myWatch.turnOn()
    myWatch.connect()

    myWatch.charge()
    myWatch.charge()
    myWatch.charge()

    myWatch.showOwner()
    myWatch.ownerName = "Rani"
    myWatch.showOwner()
}