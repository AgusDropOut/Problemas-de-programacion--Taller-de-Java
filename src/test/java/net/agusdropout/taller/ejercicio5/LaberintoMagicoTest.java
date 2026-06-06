package net.agusdropout.taller.ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LaberintoMagicoTest {

    @Test
    void getCostoSalida_caminoLibre_encuentraSalida() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', 'S'}
        };
        boolean[][] pisados = new boolean[3][3];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(4, resultado);
    }

    @Test
    void getCostoSalida_caminoBloqueado_retornaMenosUno() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', '#', '.'},
                {'.', '#', '.'},
                {'.', '#', 'S'}
        };
        boolean[][] pisados = new boolean[3][3];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(-1, resultado);
    }

    @Test
    void getCostoSalida_multiplesSalidas_encuentraSalida() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', '.', 'S'},
                {'.', '#', '.'},
                {'.', '.', 'S'}
        };
        boolean[][] pisados = new boolean[3][3];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertTrue(resultado > 0);
    }

    @Test
    void getCostoSalida_entradaAdyacenteSalida_retornaUno() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', 'S'}
        };
        boolean[][] pisados = new boolean[1][2];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(1, resultado);
    }

    @Test
    void getCostoSalida_sinSalida_retornaMenosUno() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}
        };
        boolean[][] pisados = new boolean[3][3];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(-1, resultado);
    }

    @Test
    void getCostoSalida_portalEsUnicoCamino_encuentraSalida() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', 'a', '#', 'a', 'S'}
        };
        boolean[][] pisados = new boolean[1][5];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(3, resultado);
    }

    @Test
    void getCostoSalida_caminoConAtajoPortal_retornaCostoOptimo() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', '.', '.', '.', 'S'},
                {'x', '#', '#', '#', 'x'}
        };
        boolean[][] pisados = new boolean[2][5];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(3, resultado);
    }

    @Test
    void getCostoSalida_portalesDiferentes_noSeMezclan() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', 'a', '#', 'b', 'S'},
                {'#', 'b', '#', 'a', '#'}
        };
        boolean[][] pisados = new boolean[2][5];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(4, resultado);
    }

    @Test
    void getCostoSalida_portalSinSalida_retornaMenosUno() {
        LaberintoMagico laberinto = new LaberintoMagico();
        char[][] mapa = {
                {'E', 'z', '#', 'z', '.'}
        };
        boolean[][] pisados = new boolean[1][5];
        pisados[0][0] = true;

        int resultado = laberinto.getMinCostoSalida(mapa, 0, 0, 0, pisados);

        assertEquals(-1, resultado);
    }
}