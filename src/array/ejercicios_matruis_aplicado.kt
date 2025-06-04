package array

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val matriu = Array(5) { IntArray(5) { (1..100).random() } }

    println("Introduce un número a buscar:")
    val num = scanner.nextInt()

    var encontrado = false

    for (i in 0..4) {
        for (j in 0..4) {
            if (matriu[i][j] == num) {
                println("Encontrado en posición: fila ${i + 1}, columna ${j + 1}")
                encontrado = true
            }
        }
    }

    if (!encontrado) {
        println("El número no está en la matriz.")
    }
}


