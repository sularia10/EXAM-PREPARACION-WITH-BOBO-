import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val year = scanner.nextInt()
    val month = scanner.nextInt()
    var day = scanner.nextInt()
    var num = 0



    if(month in 1 ..12 ){
        when(month){
            1,3,5,7,8,10,12 ->{
               num = 31
            }
            4,6,9,11 -> {
                num = 30
            }
            2 -> {
                if((year %4 == 0 && year % 100 == 0)|| year % 400 == 0){
                    num = 29
                }else{
                num = 28
                }
            }
        }
    }


}