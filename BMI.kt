fun calculateBMI(weight: Double, height: Double): Double {
    val heightInMeters = height / 100
    return weight / (heightInMeters * heightInMeters)
}

fun main() {
    print("Masukkan berat badan Anda (kg): ")
    val weight = readLine()?.toDouble()

    print("Masukkan tinggi badan Anda (cm): ")
    val height = readLine()?.toDouble()

    if (weight != null && height != null) {
        val bmi = calculateBMI(weight, height)

        println("BMI Anda adalah $bmi")

        if (bmi < 18.5) {
            println("Berat badan kurang")
        } else if (bmi < 25) {
            println("Berat badan normal")
        } else if (bmi < 30) {
            println("Berat badan berlebih")
        } else {
            println("Obesitas")
        }
    } else {
        println("Input tidak valid")
    }
}
