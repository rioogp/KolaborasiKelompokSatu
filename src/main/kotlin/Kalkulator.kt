fun main(){

    print("Masukan angka pertama: ")
    var angkaPertama = readLine()!!.toInt()
    print("Masukan angka kedua: ")
    var angkaKedua = readLine()!!.toInt()

    print("Pilih Operator (+, -, *, /): ")
    var operator = readLine()!!.toString()[0]

    var pilihanOperator: Int

    when(operator){
        '+' -> pilihanOperator = angkaPertama + angkaKedua.toInt()
        '-' -> pilihanOperator = angkaPertama - angkaKedua.toInt()
        '*' -> pilihanOperator = angkaPertama * angkaKedua.toInt()
        '/' -> pilihanOperator = (angkaPertama / angkaKedua).toInt()
        else -> {
            println("Pilih Operator Yang Benar!!!")
            return
        }
    }

    println("$angkaPertama $operator $angkaKedua = $pilihanOperator ")
}