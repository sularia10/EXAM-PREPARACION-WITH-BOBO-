package P3

fun main() {
    // Demanem una paraula
    print("Escriu una paraula: ")
    val paraula = readLine()!!

    // La mostrem 100 vegades
    for (i in 1..100) {
        println("$i: $paraula")
    }
}
