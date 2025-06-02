package P2

fun main() {
    // Demanem la nota
    print("Introdueix la teva nota (entre 0 i 10): ")
    val nota = readLine()!!.toDouble()

    // Comprovem en quin rang està la nota i mostrem el resultat corresponent
    if (nota < 0 || nota > 10) {
        // Control d'error si la nota no és vàlida
        println("Error: la nota ha d'estar entre 0 i 10.")
    } else if (nota < 5) {
        println("Has suspès.")
    } else if (nota == 5.0) {
        println("Suficient.")
    } else if (nota == 6.0) {
        println("Bé.")
    } else if (nota == 7.0 || nota == 8.0) {
        println("Notable.")
    } else { // nota 9 o 10
        println("Excel·lent.")
    }
}
