package net.agusdropout.taller.ejercicio1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PalabraMasUsada {
    private Map<String, Integer> wordCount;

    public PalabraMasUsada(){
        this.wordCount = new HashMap<>();
    }

    /**
     * @param texto del cual se extraen las palabras
     * @param N longitud minima de las palabras
     * @return la palabra más usada en texto
     */
    public String getPalabraMasUsada(String texto, int N){
        texto = texto.toLowerCase();

        // La expresion regular identifica cualquier string de elementos que no sean minusculas
        // Referencia: https://www.w3schools.com/java/java_regex.asp
        String[] palabras = texto.split("[^a-z]+");

        System.out.println(Arrays.toString(palabras) + palabras.length);


        // Se cuentan las palabras y se van almacenando en un mapa.
        // A la vez se lleva en cada iteracion la palabra más usada hasta el momento y su conteo.
        String palabraMasUsadaHastaAhora = "";
        int cantidadMasUsada = -1000;
        for (String palabra : palabras){
            if (palabra.length() >= N) {
                if (!wordCount.containsKey(palabra)){
                    wordCount.put(palabra, 0);
                }
                wordCount.merge(palabra, 1, Integer::sum);
                if (wordCount.get(palabra) > cantidadMasUsada) {
                    cantidadMasUsada = wordCount.get(palabra);
                    palabraMasUsadaHastaAhora = palabra;
                }
            }
        }

        System.out.println(wordCount);

        return palabraMasUsadaHastaAhora;
    }




}
