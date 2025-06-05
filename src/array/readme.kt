package array

fun comprovarTalla(tallaUsuari: Int, stock: Array<Int>): Boolean {
    for (talla in stock) {
        if (talla == tallaUsuari) return true
    }
    return false
}

fun main() {
    val stock = arrayOf(38, 39, 40, 41, 42, 43)
    println("Introdueix la teva talla:")
    val tallaUsuari = readln().toInt()

    if (comprovarTalla(tallaUsuari, stock)) {
        println("✔ Talla disponible")
    } else {
        println("❌ Talla no disponible")
    }

    for (x in stock){
    println(x)}

    println("${stock.joinToString("")}")
}
