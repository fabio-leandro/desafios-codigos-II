package com.fabio.area;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCirculoTest {

    private final AreaCirculo areaCirculo = new AreaCirculo();
    private static final double NUMERO_PI = 3.14159;

    @Test
    void deveCalcularAreaCirculo(){
        //given
        double raio = 2.00;
        //when
        double raioEsperado = NUMERO_PI * (Math.pow(raio,2));
        //then
        double raioAtual = areaCirculo.calcularAreaCirculo(raio);
        Assertions.assertEquals(raioEsperado, raioAtual);
    }

    @Test
    void deveFormatarRespostaAreaDoRaio(){
        //given
        double raio = 2.00;
        //when
        String raioEsperado = String.format("A=%.4f", NUMERO_PI * (Math.pow(raio,2)));
        //then
        String raioAutual = areaCirculo.formatarAreaCirculo(NUMERO_PI * (Math.pow(raio,2)));
        Assertions.assertEquals(raioEsperado,raioAutual);
    }
}
