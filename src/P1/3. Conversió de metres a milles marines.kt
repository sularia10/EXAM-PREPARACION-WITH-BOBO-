package P1

fun main() {
    // 1 milla marina = 1852 metres
    val millaMarina = 1852.0

    // Demanem la distància en metres
    print("Escriu la distància en metres: ")
    val metres = readLine()!!.toDouble()

    // Convertim a milles marines
    val milles = metres / millaMarina

    // Mostrem el resultat
    println("$metres metres són $milles milles marines")
}
