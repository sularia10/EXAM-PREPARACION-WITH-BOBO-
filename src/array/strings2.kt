package array

import java.util.Scanner

fun main(){
    println("GIVE ME ONE OF THIS WORDS: #dolor #mollis #aliquam #Integer #dolor #dolor #dolor")
    val scanner = Scanner(System.`in`)
    var word = scanner.nextLine()

    var texto = """Lorem ipsum #dolor sit amet, consectetur adipiscing elit. Phasellus et eleifend lectus. Phasellus tempus sapien elit, viverra varius sem sagittis eu. Suspendisse finibus volutpat erat, id #mollis nunc porttitor pretium. Nunc eleifend, ipsum a mollis venenatis, mauris dui posuere justo, eu feugiat metus dui et tortor. Phasellus suscipit metus nec egestas semper. Curabitur nec mauris sed nisi pretium vulputate. Nulla non velit augue. Sed pharetra consequat elit, nec pellentesque tellus rhoncus vitae. Proin #dolor laoreet laoreet ultricies. Praesent maximus ligula quis leo varius rhoncus. Fusce semper nisl ex, sed ultricies risus #aliquam ut. Nam posuere tellus ut tincidunt laoreet. #Integer id urna faucibus, tristique ipsum at, mollis felis. Nunc efficitur nibh non facilisis faucibus. Donec sodales odio sed #dolor fringilla euismod. Donec congue mi ut augue rutrum, nec elementum lacus auctor. Nam iaculis sollicitudin justo bibendum commodo. Nam ac vehicula libero #dolor."""
    var array = texto.split(" ")

    var howManyTime = array.count( {it.contains("$word", ignoreCase = true)})
    var howManyTimeWith = array.count( {it.startsWith("#", ignoreCase = true)})

    println(howManyTime)

}
