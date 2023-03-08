import KalkulatorReno.KalkulatorR

fun main() {
    val calculator = KalkulatorR()

    print("Masukkan angka Pertama : ")
    val a = readLine()!!.toInt()

    print("Masukkan angka Kedua : ")
    val b = readLine()!!.toInt()

    print("Pilih Operasi (*, /, -, +) : ")
    val op = readLine()

    val result = when (op) {
        "+" -> calculator.tambah(a, b)
        "-" -> calculator.kurang(a, b)
        "*" -> calculator.kali(a, b)
        "/" -> calculator.bagi(a, b)
        else -> throw IllegalArgumentException("Operasi yang dimasukkan tidak valid")
    }

    println("Hasil dari $a $op $b = $result")
}
