package KalkulatorRio

class KalkulatorRio {
    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    fun kurang(a: Double, b: Double): Double {
        return a - b
    }

    fun kali(a: Double, b: Double): Double {
        return a * b
    }

    fun bagi(a: Double, b: Double): Double {
        return a / b
    }
}

fun main() {
    // Menerima input angka pertama
    print("Masukkan angka pertama: ")
    val angka1 = readLine()?.toDouble() ?: 0.0

    // Menerima input angka kedua
    print("Masukkan angka kedua: ")
    val angka2 = readLine()?.toDouble() ?: 0.0

    // Menerima input operasi
    print("Operasi: tambah - kurang - kali - bagi (pilih salah satu): ")
    val operasi = readLine()

    // Membuat objek kalkulator
    val kalkulator = KalkulatorRio()

    // Melakukan operasi sesuai dengan input
    val hasil = when (operasi) {
        "tambah" -> kalkulator.tambah(angka1, angka2)
        "kurang" -> kalkulator.kurang(angka1, angka2)
        "kali" -> kalkulator.kali(angka1, angka2)
        "bagi" -> kalkulator.bagi(angka1, angka2)
        else -> {
            println("coba lagi")
            return
        }
    }
    // Menampilkan hasil
    println("Hasil: $angka1 $operasi $angka2 = $hasil")
}
