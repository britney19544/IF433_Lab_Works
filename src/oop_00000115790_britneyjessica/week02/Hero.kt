package oop_00000115790_britneyjessica.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100   // default
) {

    fun attack(targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        // wajib: hp tidak boleh minus
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

