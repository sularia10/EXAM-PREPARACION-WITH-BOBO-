package P3

fun main() {
    // Demanem el número
    print("Escriu un número per veure la seva taula de multiplicar: ")
    val numero = readLine()!!.toInt()

    // Mostrem la taula del número
    for (i in 1..10) {
        val x = numero * i
        println("$numero x $i= $x ")
    }
}
