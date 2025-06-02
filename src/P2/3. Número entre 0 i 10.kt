package P2

fun main() {
    var numero: Int

    // Fem servir un bucle do-while per assegurar que el número sigui correcte
    do {
        print("Escriu un número entre 0 i 10: ")
        numero = readLine()!!.toInt()

        // Si el número no està dins del rang, mostrem un error
        if (numero < 0 || numero > 10) {
            println("Error: el número ha d'estar entre 0 i 10.")
        }

    } while (numero < 0 || numero > 10)

    // Si el número és correcte, ho confirmem
    println("Número correcte: $numero")
}
