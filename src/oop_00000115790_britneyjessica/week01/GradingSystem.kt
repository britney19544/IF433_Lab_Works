package oop_00000115790_britneyjessica.week01

fun main () {
    val name: String = "BritBrit"
    val score: Int = 80
    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79-> "C"
        else -> "D"
    }

    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
    println("Nama: $name, Nilai: $score")
    println("Grade: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

