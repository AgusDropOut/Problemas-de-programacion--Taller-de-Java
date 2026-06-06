package net.agusdropout.taller.ejercicio4;

public class FotosArtisticas {


    public int getCantFotosArtisticas(char[] arreglo, int X , int Y){
        int resultado = 0;


        for(int i = 0; i < arreglo.length; i++){
            int cantFotografosIzquierda = 0;
            int cantEscenariosIzquierda = 0;
            int cantFotografosDerecha = 0;
            int cantEscenariosDerecha = 0;


            if(arreglo[i] == 'a'){

                for(int j = i + X; j <= i + Y && j < arreglo.length ; j++){
                    if(arreglo[j] == 'f'){
                        cantFotografosDerecha++;
                    }
                    if(arreglo[j] == 'e'){
                        cantEscenariosDerecha++;
                    }
                }



                for(int j = i - X; j >= i - Y && j >= 0 ; j--){
                    if(arreglo[j] == 'f'){
                        cantFotografosIzquierda++;
                    }
                    if(arreglo[j] == 'e'){
                        cantEscenariosIzquierda++;
                    }
                }

                resultado += (cantFotografosIzquierda * cantEscenariosDerecha) + ( cantEscenariosIzquierda * cantFotografosDerecha);


            }


        }

        return resultado;
    }







}
