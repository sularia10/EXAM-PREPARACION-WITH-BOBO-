package testing

class Calculadora {
    fun suma(a: Int, b: Int): Int = a + b
    fun resta(a: Int, b: Int): Int = a - b
    fun multiplicar(a: Int, b: Int): Int = a * b
    fun dividir(a: Int, b: Int): Int {
        if (b == 0) throw ArithmeticException("División por cero")
        return a / b
    }
}
