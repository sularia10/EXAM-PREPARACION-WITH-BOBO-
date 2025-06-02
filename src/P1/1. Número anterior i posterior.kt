package P1

fun main() {
    // Demanem un número a l'usuari
    print("Escriu un número: ")
    val numero = readln().toInt()

    // Calculem l'anterior i el posterior
    val anterior = numero - 1
    val posterior = numero + 1

    // Mostrem el resultat
    println("El número anterior és $anterior")
    println("El número posterior és $posterior")
}
