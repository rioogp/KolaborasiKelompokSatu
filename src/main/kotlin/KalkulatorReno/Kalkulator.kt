package KalkulatorReno

class Kalkulator {
    fun tambah(a: Int, b: Int): Int {
        return a + b
    }

    fun kurang(a: Int, b: Int): Int {
        return a - b
    }

    fun kali(a: Int, b: Int): Int {
        return a * b
    }

    fun bagi(a: Int, b: Int): Double {
        return a.toDouble() / b.toDouble()
    }
}