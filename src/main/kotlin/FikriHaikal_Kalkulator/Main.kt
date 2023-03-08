package FikriHaikal_Kalkulator

import java.lang.IllegalArgumentException

fun main() {
    println("Masukan angka pertama : ")
    val angka1 = readLine()!!.toDouble()

    println("Masukan Operator (+, -, *, /) :")
    val pilihan = readLine()

    println("Masukan Angka Kedua : ")
    val angka2 = readLine()!!.toDouble()

    val hasil = when(pilihan){
        "+" -> angka1 + angka2
        "-" -> angka1 - angka2
        "*" -> angka1 * angka2
        "/" -> angka1 / angka2
        else -> throw IllegalArgumentException("Operator yang dimasukan tidak valid")
    }
    println("Hasil : $hasil")
}
