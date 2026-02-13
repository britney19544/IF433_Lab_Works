package oop_00000115790_britneyjessica.week02

class Student (
    val name: String,
    val nim: String,
    var major
){
    init {
        //validasi sederhana:
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidka valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}