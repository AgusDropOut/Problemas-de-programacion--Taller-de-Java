package net.agusdropout.taller.ejercicio2;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursivoTest {

    @Test
    void fib_n0_returns1() {
        FibonacciRecursivo fibonacci = new FibonacciRecursivo();

        long result =  fibonacci.fib(0);

        assertEquals(0,result);

    }

    @Test
    void fib_n1_returns1() {
        FibonacciRecursivo fibonacci = new FibonacciRecursivo();

        long result =  fibonacci.fib(1);

        assertEquals(1,result);

    }


}