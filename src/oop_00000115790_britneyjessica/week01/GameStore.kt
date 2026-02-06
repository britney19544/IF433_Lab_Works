package oop_00000115790_britneyjessica.week01

fun main() {

    val gameTitle = "Mario Kart"
    val price = 650000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Game Title: $title")
    println("Final Price: Rp$finalPrice")
    println("Notes: ${note ?: "No Notes"}")
}
