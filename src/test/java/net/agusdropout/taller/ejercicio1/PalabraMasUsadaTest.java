package net.agusdropout.taller.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalabraMasUsadaTest {

    @Test
    void getPalabraMasUsada_n1mostJugar_shouldPass() {
        PalabraMasUsada palabraMasUsada = new PalabraMasUsada();

        String result = palabraMasUsada.getPalabraMasUsada("Hola4soy3marcos_rodriguez y me gusta jugar al Elden Ring, jugar si?jugar", 1);

        assertEquals("jugar", result );
    }

    @Test
    void getPalabraMasUsada_n2_winEl(){
        PalabraMasUsada palabraMasUsada = new PalabraMasUsada();
        String texto = "El code smell Feature Envy ocurre cuando el método usa más atributos " +
                "de otras clases que de la suya. Este Feature Envy genera un acoplamiento " +
                "excesivo. Reducir este acoplamiento es clave, porque el acoplamiento alto " +
                "arruina sistemas.\n" +
                "Por otro lado, la Shotgun Surgery significa que un solo cambio lógico " +
                "impacta en múltiples clases... ¡Evitar el Feature Envy, aislar cada " +
                "feature y curar la Shotgun Surgery mejora el código, el código y el CÓDIGO!";
        int n = 2;

        String result = palabraMasUsada.getPalabraMasUsada(texto, n);

        assertEquals("el", result);
    }

    @Test
    void getPalabraMasUsada_n3_winFeature(){
        PalabraMasUsada palabraMasUsada = new PalabraMasUsada();
        String texto = "El code smell Feature Envy ocurre cuando el método usa más atributos " +
                "de otras clases que de la suya. Este Feature Envy genera un acoplamiento " +
                "excesivo. Reducir este acoplamiento es clave, porque el acoplamiento alto " +
                "arruina sistemas.\n" +
                "Por otro lado, la Shotgun Surgery significa que un solo cambio lógico " +
                "impacta en múltiples clases... ¡Evitar el Feature Envy, aislar cada " +
                "feature y curar la Shotgun Surgery mejora el código, el código y el CÓDIGO!";
        int n = 3;

        String result = palabraMasUsada.getPalabraMasUsada(texto, n);

        assertEquals("feature", result);
    }

    @Test
    void getPalabraMasUsada_n8_winAcoplamiento(){
        PalabraMasUsada palabraMasUsada = new PalabraMasUsada();
        String texto = "El code smell Feature Envy ocurre cuando el método usa más atributos " +
                "de otras clases que de la suya. Este Feature Envy genera un acoplamiento " +
                "excesivo. Reducir este acoplamiento es clave, porque el acoplamiento alto " +
                "arruina sistemas.\n" +
                "Por otro lado, la Shotgun Surgery significa que un solo cambio lógico " +
                "impacta en múltiples clases... ¡Evitar el Feature Envy, aislar cada " +
                "feature y curar la Shotgun Surgery mejora el código, el código y el CÓDIGO!";
        int n = 9;

        String result = palabraMasUsada.getPalabraMasUsada(texto, n);

        assertEquals("acoplamiento", result);
    }

}