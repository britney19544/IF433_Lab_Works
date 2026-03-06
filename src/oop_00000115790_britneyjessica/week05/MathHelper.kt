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