package oop_00000115790_britneyjessica.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}