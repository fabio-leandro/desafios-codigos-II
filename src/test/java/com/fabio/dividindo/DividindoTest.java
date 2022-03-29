package com.fabio.dividindo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DividindoTest {

    @Test
    void deveDividirDoisValores(){

        int n1 = 200;
        int n2 = 300;

        BigDecimal bigDecimalN1 = new BigDecimal(String.valueOf(n1));
        BigDecimal bigDecimalN2 = new BigDecimal(String.valueOf(n2));

        BigDecimal divisao = bigDecimalN1.divide(bigDecimalN2,1, RoundingMode.HALF_EVEN);
        String resultadoEsperado = String.valueOf(divisao).replace('.',',');

        String resultadoAtual = Dividindo.dividir(n1,n2);

        Assertions.assertEquals(resultadoEsperado,resultadoAtual);

    }

    @Test
    void deveRetornarDivisaoImpossivel(){

        String resultadoAtual = Dividindo.dividir(3,0);
        Assertions.assertEquals("divisao impossivel", resultadoAtual);
    }
}
