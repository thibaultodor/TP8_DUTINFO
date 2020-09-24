package fr.umontpellier.iut.expressions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationTest {

    @Test
    void calculerValeur_10_fois_5() {
        Expression e = new Operation('*', new Nombre(10), new Nombre(5));
        assertEquals(50, e.calculerValeur());
    }

    @Test
    void calculerValeur_10_divise_2() {
        Expression e = new Operation('/', new Nombre(10), new Nombre(2));
        assertEquals(5, e.calculerValeur());
    }

    @Test
    void calculerValeur_10_divise_0() {
        Exception exception = assertThrows(
                RuntimeException.class,
                () -> new Operation('/', new Nombre(10), new Nombre(0)).calculerValeur());
        String expectedMessage = "Division par zéro";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void calculerValeur_10_multiplie_2() {
        Expression e = new Operation('*', new Nombre(10), new Nombre(2));
        assertEquals(20, e.calculerValeur());
    }

    @Test
    void calculerValeur_10_moins_2() {
        Expression e = new Operation('-', new Nombre(10), new Nombre(2));
        assertEquals(8, e.calculerValeur());
    }

    @Test
    void calculerValeur_10_divise_3() {
        Expression e = new Operation('/', new Nombre(10), new Nombre(3));
        assertEquals(3.33, e.calculerValeur(),0.01);
    }
}
