package array

fun main(){
    val numeros = arrayOf(10, 20, 30, 40, 50)

    val buscar = 30
    var encontrado = false
    for (num in numeros) {
        if (num == buscar) {
            encontrado = true
            break
        }
    }
    println("¿Se encontró el número $buscar? $encontrado")

}