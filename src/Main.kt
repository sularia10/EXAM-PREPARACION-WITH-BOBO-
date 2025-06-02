import java.util.Scanner
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val scanner = Scanner(System.`in`)
    var totalGames = 0
    var usuWins = 0
    var ordinadorWins = 0
    var gameDraw = 0

    var verificador = false

    do {
        totalGames += 1
        var numeroRandom = Random.nextInt(1..3)
        println("$numeroRandom")
        println(" 1 (pedra), 2 (paper) o 3 (tisora) ")
        var numeroUsuario = scanner.nextInt()
        if (numeroUsuario == numeroRandom) {
            println("EMPATE")
            gameDraw++
        } else if (
            (numeroRandom == 1 && numeroUsuario == 3) ||
            (numeroRandom == 2 && numeroUsuario == 1) ||
            (numeroRandom == 3 && numeroUsuario == 1)
        ) {
            println("odinador gana")
            ordinadorWins += 1
        } else {
            println("usuario gana")
            usuWins += 1
        }



        println("Vols jugar una altra vegada? 1 = sí, 2 = no")
        val answerUsu = scanner.nextInt()
        if (answerUsu == 2) {
            if (totalGames > 0) {
                val percentOrd = (ordinadorWins * 100) / totalGames
                val percentUsu = (usuWins * 100) / totalGames
                val percenEmpat = (gameDraw * 100) / totalGames
                println("\n--- Estadístiques ---")
                println("Empats: $percenEmpat%")
                println("Guanyades per l’usuari: $percentUsu%")
                println("Guanyades per l’ordinador: $percentOrd%")
            }
            verificador = true
        }

    } while (!verificador)
}