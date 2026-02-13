package oop_00000115790_britneyjessica.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()


    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")

    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
    print("Pilih jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }


    println("=== LIBRARY LOAN SYSTEM ===")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi
    if (duration < 1) {
        println("Durasi tidak valid. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam   : ${loan.borrower}")
    println("Durasi     : ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

    scanner.nextLine()   // clear enter

    print("Masukkan nama hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)

    var enemyHp = 100

    println("\nMusuh muncul dengan HP $enemyHp!")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val pilih = scanner.nextInt()

        if (pilih == 1) {
            hero.attack("Musuh")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP musuh sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
            }

            println("HP hero sekarang: ${hero.hp}")

        } else if (pilih == 2) {
            println("${hero.name} kabur dari pertempuran!")
            break
        }
    }

    println("\n=== HASIL PERTEMPURAN ===")
    if (hero.hp > enemyHp) {
        println("${hero.name} MENANG!")
    } else if (hero.hp < enemyHp) {
        println("Musuh MENANG!")
    } else {
        println("Seri!")
    }
}








