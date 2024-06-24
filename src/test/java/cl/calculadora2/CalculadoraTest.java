package cl.calculadora2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(0, calc.sumar(-2, 2));
        assertEquals(1000, calc.sumar(500, 500));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
        assertEquals(-5, calc.restar(0, 5));
        assertEquals(0, calc.restar(10, 10));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(0, calc.multiplicar(5, 0));
        assertEquals(-15, calc.multiplicar(3, -5));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(0, calc.dividir(0, 5));
        assertEquals(-2, calc.dividir(10, -5));
    }


}
