package oop_00000115790_britneyjessica.week01

fun main() {

    val gameTitle = "Mario Kart"
    val price = 650000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }

