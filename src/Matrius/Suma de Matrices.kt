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

    val suma = Array(filas) { DoubleArray(columnas) { 0.0 } }

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            suma[i][j] = A[i][j] + B[i][j]
        }
    }

// Imprimir suma
    for (fila in suma) {
        println(fila.joinToString(prefix = "[", postfix = "]", separator = ", "))
    }

}