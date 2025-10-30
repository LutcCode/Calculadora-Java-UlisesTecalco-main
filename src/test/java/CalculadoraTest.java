package src.test.java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import src.main.java.Operaciones;

public class CalculadoraTest {

    @Test
    public void testSuma() {
    assertEquals(9, Operaciones.sumar(4, 5), 0.001);
    }

    @Test
    public void testResta() {
    assertEquals(2, Operaciones.restar(5, 3), 0.001);
    }

    @Test
    public void testMultiplicacion() {
    assertEquals(15, Operaciones.multiplicar(5, 3), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2, Operaciones.dividir(6, 3), 0.001);
    }

}