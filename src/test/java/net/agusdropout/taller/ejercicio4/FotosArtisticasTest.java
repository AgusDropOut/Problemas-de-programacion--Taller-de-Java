package net.agusdropout.taller.ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FotosArtisticasTest {

    @Test
    void getCantFotosArtisticas_casoEnunciadoTres_deberiaRetornarTres() {
        FotosArtisticas fotos = new FotosArtisticas();

        char[] arreglo = {'.','f','e','a','a','f','.','e'};
        int X = 1;
        int Y = 3;

        int result = fotos.getCantFotosArtisticas(arreglo,X,Y);

        assertEquals(3,result);

    }

    @Test
    void getCantFotosArtisticas_casoEnunciadoUno_deberiaRetornarUno() {
        FotosArtisticas fotos = new FotosArtisticas();
        char[] arreglo = {'a','f','a','e','a'};
        int X = 1;
        int Y = 2;

        int result = fotos.getCantFotosArtisticas(arreglo, X, Y);

        assertEquals(1, result);
    }

    @Test
    void getCantFotosArtisticas_casoEnunciadoDos_deberiaRetornarCero() {
        FotosArtisticas fotos = new FotosArtisticas();
        char[] arreglo = {'a','f','a','e','a'};
        int X = 2;
        int Y = 3;

        int result = fotos.getCantFotosArtisticas(arreglo, X, Y);

        assertEquals(0, result);
    }

    @Test
    void getCantFotosArtisticas_arregloVacio_deberiaRetornarCero() {
        FotosArtisticas fotos = new FotosArtisticas();
        char[] arreglo = {};
        int X = 1;
        int Y = 3;

        int result = fotos.getCantFotosArtisticas(arreglo, X, Y);

        assertEquals(0, result);
    }

    @Test
    void getCantFotosArtisticas_sinArtistas_deberiaRetornarCero() {
        FotosArtisticas fotos = new FotosArtisticas();
        char[] arreglo = {'f','e','f','e','.'};
        int X = 1;
        int Y = 3;

        int result = fotos.getCantFotosArtisticas(arreglo, X, Y);

        assertEquals(0, result);
    }

    @Test
    void getCantFotosArtisticas_distanciaMinimaExacta_deberiaRetornarDos() {
        FotosArtisticas fotos = new FotosArtisticas();
        char[] arreglo = {'f','a','e','a','f'};
        int X = 1;
        int Y = 1;

        int result = fotos.getCantFotosArtisticas(arreglo, X, Y);

        assertEquals(2, result);
    }

    @Test
    void getCantFotosArtisticas_elementosMuyCerca_deberiaRetornarCero() {
        FotosArtisticas fotos = new FotosArtisticas();
        char[] arreglo = {'f','a','e'};
        int X = 2;
        int Y = 4;

        int result = fotos.getCantFotosArtisticas(arreglo, X, Y);

        assertEquals(0, result);
    }

    @Test
    void getCantFotosArtisticas_elementosMuyLejos_deberiaRetornarCero() {
        FotosArtisticas fotos = new FotosArtisticas();
        char[] arreglo = {'f','.','.','.','a','.','.','.','e'};
        int X = 1;
        int Y = 2;

        int result = fotos.getCantFotosArtisticas(arreglo, X, Y);

        assertEquals(0, result);
    }
}