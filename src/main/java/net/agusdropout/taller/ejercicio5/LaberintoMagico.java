package net.agusdropout.taller.ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaberintoMagico {
    // derecha | abajo | izquierda | arriba
    private final int[] movFila =    { 0, 1, 0, -1};
    private final int[] movColumna = { 1, 0,-1, 0};

    private int mejorCosto = Integer.MAX_VALUE;

    private Map<Character, List<Coordenada>> ubicacionesPortales = new HashMap<>();


    private void mapearPortales(char[][] laberinto){
        for(int i = 0 ;  i < laberinto.length ; i++){ //columnas
            for (int j = 0 ; j < laberinto[0].length ; j++){ //fila

                if(laberinto[i][j] >= 'a' && laberinto[i][j] <= 'z'){
                    ubicacionesPortales.computeIfAbsent(laberinto[i][j], k -> new ArrayList<>()).add(new Coordenada(i,j));
                }
            }
        }
    }


    public int getMinCostoSalida (char[][] laberinto, int pasos, int filaActual , int columnaActual, boolean[][] pisados) {
        mapearPortales(laberinto);
        getCostoSalida(laberinto,pasos,filaActual,columnaActual,pisados);
        if(mejorCosto != Integer.MAX_VALUE){
            return mejorCosto;
        } else {
            return -1;
        }
    }


    public void getCostoSalida(char[][] laberinto, int pasos, int filaActual , int columnaActual, boolean[][] pisados){


        if(laberinto[filaActual][columnaActual] == 'S'){
            mejorCosto = Math.min(pasos, mejorCosto);
        } else {


            if(laberinto[filaActual][columnaActual] >= 'a' && laberinto[filaActual][columnaActual] <= 'z'){

                for(Coordenada coor : ubicacionesPortales.get(laberinto[filaActual][columnaActual])){
                    if((coor.fila != filaActual || coor.columna != columnaActual) && !pisados[coor.fila][coor.columna]){
                        pisados[coor.fila][coor.columna] = true;
                        getCostoSalida(laberinto, pasos + 1, coor.fila, coor.columna, pisados);
                        pisados[coor.fila][coor.columna] = false;
                    }
                }

            }

            for(int i = 0 ; i < movFila.length ; i++){

                int movf = filaActual;
                int movc = columnaActual;
                movf += movFila[i];
                movc += movColumna[i];


                boolean filaDentroDeRango    = movf >= 0 && movf < laberinto.length;
                boolean columnaDentroDeRango = movc >= 0 && movc < laberinto[0].length;
                if(filaDentroDeRango && columnaDentroDeRango) {

                    boolean esPared = laberinto[movf][movc] == '#';
                    if (!esPared && !pisados[movf][movc]) {
                            pisados[movf][movc] = true;
                            getCostoSalida(laberinto, pasos + 1, movf, movc, pisados);
                            pisados[movf][movc] = false;

                    }
                }
            }
        }
    }

    private class Coordenada {
        public int fila;
        public int columna;
        public Coordenada(int fila,int columna){
            this.fila = fila;
            this.columna = columna;
        }
    }
}
