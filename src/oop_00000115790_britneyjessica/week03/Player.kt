package oop_00000115790_britneyjessica.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount
            if (level > oldLevel) {
                println("Level Up! $username naik ke level $level")
            }
        }
    }
}

fun main() {
    val player = Player("Britney")

    player.addXp(50)
    player.addXp(60)
}
