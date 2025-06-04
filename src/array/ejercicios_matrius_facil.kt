package array

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    val matrius = Array(3) { IntArray(3) {(1..100).random()} }

//    for (x in 0..2){
//        print("fila: ${x+1}")
//        for (z in 0..2){
//            print(" ${matrius[x][z]}")
//        }
//        println()
//    }

    val matrius2 = Array(4){ IntArray(4) {(0..9).random()} }
//    var totalSuma = 0
//    for(x in 0..3) {
//        for (z in 0..3) {
//            totalSuma += matrius2[x][z]
//        }
//    }
//    println(totalSuma)


    val matrius3 = Array(4){ IntArray(4) {(0..9).random()} }
    for(x in 0..3) {
        println("fila : ${x+1}")
        var totalSuma = 0
        for (z in 0..3) {
            totalSuma += matrius3[x][z]
        }
        println("$totalSuma")
    }
}