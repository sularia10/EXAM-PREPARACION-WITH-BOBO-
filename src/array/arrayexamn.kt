package array

import java.util.Scanner

fun main() {
    val tempArray = arrayOf(-3, -4, 0, 4, 0, 7, 10)
    val pukgesArray = arrayOf(0, 12, 15, 38, 0, 0, 17)

    val scanner = Scanner(System.`in`)

    println("lunes: 1, martes: 2, miércoles: 3, jueves: 4, viernes: 5, sábado: 6, domingo: 7")
    print("Introduce el número del día (1-7): ")

    val day = scanner.nextInt()
    scanner.nextLine()

    if (day in 1..7) {
        val orgDay = day - 1
        val temp = tempArray[orgDay]
        val rain = pukgesArray[orgDay]

        println("La temperatura de hoy es: $temp ºC")

        when {
            rain < 0 -> println("Hace SOL")
            rain > 0 && temp < 0 -> println("NIEVA")
            rain > 0 && temp == 0 -> println("HAY HIELO")
            rain > 0 && temp > 0 -> println("LLUEVE")
            else -> println("No hay datos suficientes")
        }
    } else {
        println("Número de día inválido. Debe estar entre 1 y 7.")
    }
}
