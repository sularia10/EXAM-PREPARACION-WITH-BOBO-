package array

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val matriu = Array(4){ IntArray(12) { (0..3500).random()}}

//    for (x in 0..3){
//        println("Producte: ${x+1}")
//        for (z in 0..11){
//            println("Mes:${z+1} ${matriu[x][z]}")
//        }
//        println()
//    }
//    var totalVenda = 0
//    for(x in 0..3){
//        println("productes: ${x+1}")
//        for(z in 0..11){
//            totalVenda += matriu[x][z]
//        }
//        println("total venda = $totalVenda")
//    }



//    var totalVenda = 0
//    for(x in 0..3){
//        println("productes: ${x+1}")
//        for(z in 0..11){
//            totalVenda += matriu[x][z]
//        }
//        var mitjana = totalVenda/12
//        println(mitjana)
//    }


    var mitjanaTotal = 0
    var totalVenda = 0
    for(x in 0..3){
        println("productes ${x+1}")
        for(z in 0..11){
            totalVenda += matriu[x][z]
        }
        mitjanaTotal+=totalVenda
    }
    val mitjanaTotales  = mitjanaTotal/12
    println("$mitjanaTotales")

}