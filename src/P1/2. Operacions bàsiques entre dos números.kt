package P1

fun main() {
    // Demanem els dos números
    print("Escriu el primer número: ")
    val num1 = readLine()!!.toDouble()

    print("Escriu el segon número: ")
    val num2 = readLine()!!.toDouble()

    // Realitzem les operacions
    val suma = num1 + num2
    val resta = num1 - num2
    val multiplicacio = num1 * num2
    val divisio = num1 / num2

    // Mostrem els resultats
    println("Suma: $suma")
    println("Resta: $resta")
    println("Multiplicació: $multiplicacio")
    println("Divisió: $divisio")
}
