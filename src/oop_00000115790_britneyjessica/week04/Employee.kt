package oop_00000115790_britneyjessica.week04

open class Employee(
    val name: String,
    val baseSalary: Int
) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 10) / 100
    }
}

fun main() {

    val manager = Manager("Andi", 10_000_000)
    val developer = Developer("Budi", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}