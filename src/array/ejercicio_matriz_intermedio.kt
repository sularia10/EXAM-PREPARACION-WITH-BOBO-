package array

import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
//    val matriu = Array(4){ IntArray(4) }
//
//    for(x in 0..3){
//        matriu[x][x] = 1
//    }
//
//    for (x in matriu){
//        println(x.joinToString(" "))
//    }

    val matriu2 = Array(5){ IntArray(5) {(0..999).random()} }
    var num = 0
    for(x in 0..4){
        for(z in 0..4){
            if(num < matriu2[x][z]){
                num = matriu2[x][z]
            }
        }
    }
    println(num)



}