package oop_00000115790_britneyjessica.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("mencoba set gaji ke: $value")
            this.salary = value
        }
}
