package net.agusdropout.taller.ejercicio4;

public class FotosArtisticas {


    /**
     * Es una fotografia artistica si fotografo, artista y escenario estan en este orden y a una distancia entre X e Y cada uno respectivamente
     * @param arreglo de fotografos, artistas y escenarios ubicados arbitrariamente
     * @param X distancia minima
     * @param Y distancia maxima
     * @return cantidad de fotos artisticas que pueden ser tomadas
     */
    public int getCantFotosArtisticas(char[] arreglo, int X , int Y){
        int resultado = 0;

        for(int i = 0; i < arreglo.length; i++){
            int cantFotografosIzquierda = 0;
            int cantEscenariosIzquierda = 0;
            int cantFotografosDerecha = 0;
            int cantEscenariosDerecha = 0;

            // Buscamos primero una "a" que es el centro de la configuracion
            if(arreglo[i] == 'a'){

                // Contar fotografos y escenarios a la derecha
                for(int j = i + X; j <= i + Y && j < arreglo.length ; j++){
                    if(arreglo[j] == 'f'){
                        cantFotografosDerecha++;
                    }
                    if(arreglo[j] == 'e'){
                        cantEscenariosDerecha++;
                    }
                }

                // Contar fotografos y escenarios a la izquierda
                for(int j = i - X; j >= i - Y && j >= 0 ; j--){
                    if(arreglo[j] == 'f'){
                        cantFotografosIzquierda++;
                    }
                    if(arreglo[j] == 'e'){
                        cantEscenariosIzquierda++;
                    }
                }

                // Calculo de la cantidad de fotos que pueden ser tomadas
                // Cada fotografo puede tomar una foto por cada escenario
                resultado += (cantFotografosIzquierda * cantEscenariosDerecha) + ( cantEscenariosIzquierda * cantFotografosDerecha);

            }

        }

        return resultado;
    }







}
