package oop_00000115790_britneyjessica.week05

class MathHelper {

    // persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}

fun main() {
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 10)
    println("Luas Persegi Panjang (5x10): $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}