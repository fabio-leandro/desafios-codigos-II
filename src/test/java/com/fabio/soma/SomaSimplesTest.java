package com.fabio.soma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomaSimplesTest {

    @Test
    void deveRetornarSoma(){

        int A = 30;
        int B = 10;
        int somaEsperada = A + B;
        String somaAtual = SomaSimples.somar(A,B);
        Assertions.assertEquals(String.format("SOMA = %d",somaEsperada),somaAtual);

    }


}
