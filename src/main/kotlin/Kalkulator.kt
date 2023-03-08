fun main(){
    //Maulid
    print("Masukan angka pertama: ")
    var angkaPertama = readLine()!!.toInt()//disini untuk memasuka angka pertama
    print("Masukan angka kedua: ")
    var angkaKedua = readLine()!!.toInt()//disini untuk memasukan angka kedua

    print("Pilih Operator (+, -, *, /): ")//disini pemilihan operator
    var operator = readLine()!!.toString()[0]

    var pilihanOperator: Int //disini kenapa memakai int agar angka jadi int gitu kalau double jadinya 2.0 seperti itu

    when(operator){//disini memakai switch pengguna bisa memilih switch yang mana
        '+' -> pilihanOperator = angkaPertama + angkaKedua.toInt()//disini pilih operator setelah itu angka petama di tambah angka kedua
        '-' -> pilihanOperator = angkaPertama - angkaKedua.toInt()
        '*' -> pilihanOperator = angkaPertama * angkaKedua.toInt()
        '/' -> pilihanOperator = (angkaPertama / angkaKedua).toInt()
        else -> {
            println("Pilih Operator Yang Benar!!!")// dan disini jika salah memasuka operator ini akan muncul
            return
        }
    }

    println("$angkaPertama $operator $angkaKedua = $pilihanOperator ")// dan ini print hasilnya
}