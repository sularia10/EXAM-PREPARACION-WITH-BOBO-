package P3

fun main() {
    // Demanem l'edat
    print("Introdueix la teva edat: ")
    val edat = readLine()!!.toInt()

    // Mostrem els anys complerts fins l'edat
    for (i in 1..edat) {
        println("Any $i")
    }
}
