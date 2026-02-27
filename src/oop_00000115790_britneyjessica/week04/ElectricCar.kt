package oop_00000115790_britneyjessica.week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    private val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}

fun main() {
    val tesla = ElectricCar("Tesla", 4, 85)

    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}