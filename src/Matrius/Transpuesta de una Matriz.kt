package Matrius

fun main(){

    val A = arrayOf(
        doubleArrayOf(1.0, 2.0),
        doubleArrayOf(3.0, 4.0)
    )

    val B = arrayOf(
        doubleArrayOf(5.0, 6.0),
        doubleArrayOf(7.0, 8.0)
    )

    val filas = A.size
    val columnas = A[0].size


    val transpuesta = Array(columnas) { DoubleArray(filas) { 0.0 } }

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            transpuesta[j][i] = A[i][j]
        }
    }

// Imprimir transpuesta
    for (fila in transpuesta) {
        println(fila.joinToString(prefix = "[", postfix = "]", separator = ", "))
    }

}