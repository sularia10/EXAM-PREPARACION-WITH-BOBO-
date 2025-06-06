package testing

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculadoraTest {

    val calculadora = Calculadora()

    @Test
    fun testSuma() {
        val resultado = calculadora.suma(3, 7)
        assertEquals(10, resultado)
    }

    @Test
    fun testResta() {
        val resultado = calculadora.resta(10, 5)
        assertEquals(5, resultado)
    }

    @Test
    fun testMultiplicar() {
        val resultado = calculadora.multiplicar(4, 6)
        assertEquals(24, resultado)
    }

    @Test
    fun testDividir() {
        val resultado = calculadora.dividir(20, 4)
        assertEquals(5, resultado)
    }

    @Test
    fun testDividirPorCero() {
        val exception = assertThrows<ArithmeticException> {
            calculadora.dividir(10, 0)
        }
        assertEquals("División por cero", exception.message)
    }
}
