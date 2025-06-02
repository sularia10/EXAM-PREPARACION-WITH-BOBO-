fun main() {
    // Demanem l'edat a l'usuari
    print("Introdueix la teva edat: ")
    val edat = readLine()!!.toInt()

    // Comprovem si és major o menor d'edat
    if (edat >= 18) {
        println("Ets major d'edat.")
    } else {
        println("Ets menor d'edat.")
    }
}
