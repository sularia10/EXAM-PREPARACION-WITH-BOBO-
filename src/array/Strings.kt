import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introdueix el text:")
    val line = scanner.nextLine()

    println("Introdueix la paraula a cercar:")
    val word = scanner.nextLine()

    var count = 0

    val paraules = line.split(" ", "\t", "\n", ".", ",", ";", ":", "!", "?", "(", ")", "\"")

    for (x in paraules) {
        if (x.equals(word, ignoreCase = true)) {
            count++
        }
    }

    println("La paraula '$word' apareix $count vegades.")
}
