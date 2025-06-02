package P1

fun main() {
    // Suposem una taxa de canvi: 1 € = 0.85 £
    val taxaCanvi = 0.85

    // Demanem el preu en euros
    print("Introdueix el preu en €: ")
    val euros = readLine()!!.toDouble()

    // Convertim a lliures
    val lliures = euros * taxaCanvi

    // Mostrem el resultat
    println("$euros € són $lliures £")
}

