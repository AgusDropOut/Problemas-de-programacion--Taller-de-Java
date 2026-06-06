package net.agusdropout.taller.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursivoConMemorizacionTest {

    @Test
    void fib_n90_shouldPass() {
        FibonacciRecursivoConMemorizacion fibonacciConMemoria = new FibonacciRecursivoConMemorizacion();

        long result =  fibonacciConMemoria.fib(90);

        assertEquals(2880067194370816120L,result);
    }

    @Test
    void fib_n0_returns1() {
        FibonacciRecursivoConMemorizacion fibonacci = new FibonacciRecursivoConMemorizacion();

        long result =  fibonacci.fib(0);

        assertEquals(0,result);

    }

    @Test
    void fib_n1_returns1() {
        FibonacciRecursivoConMemorizacion fibonacci = new FibonacciRecursivoConMemorizacion();

        long result =  fibonacci.fib(1);

        assertEquals(1,result);

    }
}