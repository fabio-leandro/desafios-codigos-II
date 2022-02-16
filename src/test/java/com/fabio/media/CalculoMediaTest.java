package com.fabio.media;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculoMediaTest {

    private final CalculoMedia calculoMedia = new CalculoMedia();
    private final double pesoNotaA = 3.5;
    private final double pesoNotaB = 7.5;

    @Test
    void deveRetornarMedia(){

        //given
        double notaA = 5.0;
        double notaB = 7.1;

        //when
        double mediaEsperada = ((notaA * pesoNotaA) + (notaB * pesoNotaB)) / (pesoNotaA + pesoNotaB);

        //then
        double mediaActual = calculoMedia.calcularMedia(notaA, notaB);

        Assertions.assertEquals(mediaEsperada, mediaActual);

    }

    @Test
    void deveImprimirNoConsoleComCincoCasasDecimias(){
        //given
        double media = ((5.0 * pesoNotaA) + (7.1 * pesoNotaB)) / (pesoNotaA + pesoNotaB);

        //when
        String mediaEsperada = String.format("MEDIA = %.5f", media);

        //then
        String mediaActual = calculoMedia.formatarMedia(media);

        Assertions.assertEquals(mediaEsperada, mediaActual);

    }



}
