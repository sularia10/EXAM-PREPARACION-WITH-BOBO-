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

    val m = A.size
    val p = A[0].size
    val n = B[0].size

    val producto = Array(m) { DoubleArray(n) { 0.0 } }

    for (i in 0 until m) {
        for (j in 0 until n) {
            var sumaProducto = 0.0
            for (k in 0 until p) {
                sumaProducto += A[i][k] * B[k][j]
            }
            producto[i][j] = sumaProducto
        }
    }

// Imprimir producto
    for (fila in producto) {
        println(fila.joinToString(prefix = "[", postfix = "]", separator = ", "))
    }

}