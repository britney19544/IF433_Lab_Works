package oop_00000115790_britneyjessica.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}

fun main() {
    // Step 4: Instantiation
    val myEWallet = EWallet("User123", 50000.0)
    val myCreditCard = CreditCard("User123", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    // Checkpoint 10 logic: Initial loop
    for (payment in paymentList) {
        println("--- Memproses pembayaran untuk: ${payment.accountName} ---")
        payment.processPayment(75000.0)

        // smart casting
        if (payment is EWallet) {
            println("Mendeteksi E-Wallet, mencoba pemulihan saldo...")
            payment.topUp(50000.0) // Smart cast allows calling topUp
            payment.processPayment(75000.0) // Try again
        }

    }
}