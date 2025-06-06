package Matrius

fun main(){
    // Matriz A (2x2)
    val A = arrayOf(
        doubleArrayOf(1.0, 2.0),
        doubleArrayOf(3.0, 4.0)
    )

// Matriz B (2x2)
    val B = arrayOf(
        doubleArrayOf(5.0, 6.0),
        doubleArrayOf(7.0, 8.0)
    )

    val filas = A.size
    val columnas = A[0].size

    val escalar = 3.0
    val matrizEscalar = Array(filas) { DoubleArray(columnas) { 0.0 } }

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            matrizEscalar[i][j] = A[i][j] * escalar
        }
    }

// Imprimir resultado
    for (fila in matrizEscalar) {
        println(fila.joinToString(prefix = "[", postfix = "]", separator = ", "))
    }

}