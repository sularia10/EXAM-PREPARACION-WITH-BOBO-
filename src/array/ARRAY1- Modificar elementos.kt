package array

fun main(){

    val numeros = arrayOf(10, 20, 30, 40, 50)

    numeros[1] = 25  // Cambiar el segundo elemento de 20 a 25

    println(numeros.joinToString())  // Muestra: 10, 25, 30, 40, 50

}