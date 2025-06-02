package P3

fun main() {
    // Demanem un número
    print("Escriu un número: ")
    val numero = readLine()!!.toInt()

    // Contem enrere fins a 0
    for (i in numero downTo 0) {
        println(i)
    }
}
