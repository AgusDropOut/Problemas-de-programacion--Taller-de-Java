package net.agusdropout.taller.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursivoConMemorizacion {

    //El mapa nos pide objetos no nos reten porfa
    Map<Long, Long> cache = new HashMap<>();

    public FibonacciRecursivoConMemorizacion(){
        cache.put(0L,0L);
        cache.put(1L,1L);
    }


    /**
     @param n numero del cual se quiere el fibonacci
     <p>Esta solucion utiliza la estrategia de memorizacion,
     consiste en guardar los resultados intermedios en alguna estructura,
     en nuestro caso elegimos un hash por la velocidad de consulta.
     Esta estrategia es peor que la iterativa espacialmente pero mas simple de implementar,
     pero ambas poseen la misma complejidad temporal de O(n)
     <p/>
     **/

    public long fib(long n){
        if(cache.containsKey(n)) return cache.get(n);

        long result = fib(n-1) + fib(n-2);
        cache.put(n,result);

        return result;
    }

}
