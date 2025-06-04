package array

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var valid = false
    var students = 0

    // Demanar quants alumnes
    do {
        println("How many students?")
        if (scanner.hasNextInt()) {
            students = scanner.nextInt()
            scanner.nextLine() // 👈 neteja salt de línia
            valid = true
        } else {
            println("Heheh no")
            scanner.nextLine() // 👈 descarta entrada incorrecta
        }
    } while (!valid)

    // Crear array buit
    val matriu = Array(students) { "" }

    // Llegir noms
    for (x in matriu.indices) {
        print("Nom de l’alumne ${x + 1}: ")
        matriu[x] = scanner.nextLine()
    }

    // Comptadors
    var startsWith = 0
    var contains = 0

    for (x in matriu.indices) {
        if (matriu[x].startsWith("A", ignoreCase = true)) {
            startsWith++
        }
        if (matriu[x].contains("s", ignoreCase = true)) {
            contains++
        }
    }

    println("Noms que comencen amb A: $startsWith")
    println("Noms que contenen 's': $contains")

    // Demanar una lletra
    print("Introdueix una lletra per buscar: ")
    val inputLetter = scanner.nextLine().lowercase()

    if (inputLetter.length == 1) {
        val letter = inputLetter[0]
        var countTotal = 0
        val nomsAmbLletra = mutableListOf<String>()

        for (nom in matriu) {
            countTotal += nom.lowercase().count { it == letter }
            if (nom.contains(letter, ignoreCase = true)) {
                nomsAmbLletra.add(nom)
            }
        }

        println("La lletra '$letter' apareix $countTotal vegades.")
        println("Noms que la contenen:")
        for (nom in nomsAmbLletra) {
            println("- $nom")
        }

        // EXTRA: Vector nou
        val nouVector = nomsAmbLletra.toTypedArray()
        println("Nou vector: ${nouVector.joinToString(", ")}")

    } else {
        println("Només una lletra, si us plau.")
    }



//    print("Quants alumnes hi ha? ")
//    val students = readLine()!!.toInt()
//
//    val noms = Array(students) {
//        print("Nom de l’alumne ${it + 1}: ")
//        readLine()!!.trim()
//    }
//
//    val comencenAmbA = noms.count { it.startsWith("A", ignoreCase = true) }
//    val contenenS = noms.count { it.contains("s", ignoreCase = true) }
//
//    println("\nNoms que comencen amb 'A': $comencenAmbA")
//    println("Noms que contenen 's': $contenenS")
//
//    print("\nIntrodueix una lletra per buscar: ")
//    val lletraInput = readLine()!!.trim().lowercase()
//
//    if (lletraInput.length == 1) {
//        val lletra = lletraInput[0]
//
//        val totalAparicions = noms.sumOf { it.lowercase().count { c -> c == lletra } }
//        val nomsAmbLletra = noms.filter { it.contains(lletra, ignoreCase = true) }
//
//        println("La lletra '$lletra' apareix $totalAparicions vegades.")
//        println("Noms que la contenen:")
//        nomsAmbLletra.forEach { println("- $it") }
//
//        val nouVector = nomsAmbLletra.toTypedArray()
//        println("Nou vector: ${nouVector.joinToString(", ")}")
//    } else {
//        println("Introdueix només una lletra.")
//    }
}


