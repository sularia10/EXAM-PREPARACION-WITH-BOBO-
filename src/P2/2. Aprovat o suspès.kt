package P2

fun main() {
    // Demanem la nota
    print("Introdueix la teva nota (entre 0 i 10): ")
    val nota = readLine()!!.toDouble()

    // Comprovem si està aprovada (5 o més) o suspesa (menys de 5)
    if (nota >= 5) {
        println("Has aprovat.")
    } else {
        println("Has suspès.")
    }
}
