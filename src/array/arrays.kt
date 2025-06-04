package array

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val array = IntArray(1000) { (60..200).random() }

    var num1 = 0
    var num2 = 0
    var valid = false

    // Demanar límits amb validació
    do {
        println("Introdueix dues freqüències cardíaques (entre 60 i 200)")
        print("Freqüència mínima: ")
        num1 = scanner.nextInt()
        print("Freqüència màxima: ")
        num2 = scanner.nextInt()

        if (num1 in 60..200 && num2 in 60..200 && num1 <= num2) {
            valid = true
        } else {
            println("Dades incorrectes. Assegura't que estan entre 60 i 200 i que el mínim no sigui major que el màxim.")
        }

    } while (!valid)

    var sota = 0
    var dins = 0
    var sobre = 0

    for (x in array) {
        if (x in num1..num2) {
            dins++
        } else if (x < num1) {
            sota++
        } else {
            sobre++
        }
    }

    val total = array.size
    val percentDins = dins * 100.0 / total
    val percentSota = sota * 100.0 / total
    val percentSobre = sobre * 100.0 / total

    println("\nResultats:")
    println("Dins l'interval [$num1 - $num2]: $dins vegades (${String.format("%.2f", percentDins)}%)")
    println("Per sota de $num1: $sota vegades (${String.format("%.2f", percentSota)}%)")
    println("Per sobre de $num2: $sobre vegades (${String.format("%.2f", percentSobre)}%)")



}
