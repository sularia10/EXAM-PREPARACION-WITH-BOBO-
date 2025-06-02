package P1

fun main() {
    // Demanem les dimensions de la piscina
    print("Introdueix la llargada en metres: ")
    val llargada = readLine()!!.toDouble()

    print("Introdueix l'amplada en metres: ")
    val amplada = readLine()!!.toDouble()

    print("Introdueix la profunditat en metres: ")
    val profunditat = readLine()!!.toDouble()

    // Calculem el volum
    val volumMetresCubics = llargada * amplada * profunditat
    val volumLitres = volumMetresCubics * 1000

    // Mostrem el resultat
    println("Volum: $volumMetresCubics m³")
    println("Volum: $volumLitres litres")
}

