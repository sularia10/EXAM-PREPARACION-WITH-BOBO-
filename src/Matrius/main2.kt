package Matrius

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val matriu = Array(5){ Array(6) {" "} }
    matriu[0][0] = "Hora"
    matriu[0][1] = "Dilluns"
    matriu[0][2] = "Dimarts"
    matriu[0][3] = "Dimecres"
    matriu[0][4] = "Dijous"
    matriu[0][5] = "Divendres"

    matriu[1][0] = "8:00-10:00"
    matriu[1][1] = "Mat"
    matriu[1][2] = "Cat"
    matriu[1][3] = "Hist"
    matriu[1][4] = "Mat"
    matriu[1][5] = "Fis"

    matriu[2][0] = "10:00-12:00"
    matriu[2][1] = "Ang"
    matriu[2][2] = "Qui"
    matriu[2][3] = "EF"
    matriu[2][4] = "Bio"
    matriu[2][5] = "Fil"

    matriu[3][0] = "12:00-14:00"
    matriu[3][1] = "Bio"
    matriu[3][2] = "Ang"
    matriu[3][3] = "Fis"
    matriu[3][4] = "Qui"
    matriu[3][5] = "Cat"

    matriu[4][0] = "14:00-16:00"
    matriu[4][1] = "Tec"
    matriu[4][2] = "Bio"
    matriu[4][3] = "Cat"
    matriu[4][4] = "EF"
    matriu[4][5] = "Ang"

    for(x in matriu.indices) {
        println(matriu[x].joinToString("|"))
    }
    var valid = false

    do {
        println("tria una option: ")
        val num1 = scanner.nextInt()
        scanner.nextLine()

        when(num1){
            1->{
                println("Introdueix un dia de la setmana (Dilluns, Dimarts, Dimecres, Dijous, Divendres):")
                val day = scanner.nextLine()

                val position = matriu[0].indexOfFirst {it.equals(day)}

                for(x in 0..matriu.size-1){
                    println("${matriu[x][0]} : ${matriu[x][position]}")
                }
            }
            2->{
                println("Indrodueix uan franja horària (8:00-10:00, 10:00-12:00, 12:00-14:00, 14:00-16:00): ")
                val day = scanner.nextLine()
                var position= matriu.indexOfFirst {it.equals(day)}


                for (x in 1..matriu.size){
                    println("${matriu[0][x]} : ${matriu[position][x]}")
                }
            }
            3->{}
            4->{valid = true}
        }
    }while (!valid)

}

fun menu(): String{
    return """
        ---------------------------------------------
                       Horari Escolar
        ---------------------------------------------
        1. Esclllir un dia de la setmana
        2. Escollir una franja Horaria
        3. Escollir una assugnatura 
        4. Sortir
        ---------------------------------------------
    """.trimIndent()
}