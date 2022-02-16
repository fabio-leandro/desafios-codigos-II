package com.fabio.feira;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisitaFeiraTest {

    private final VisitaFeira visitaFeira = new VisitaFeira();

    @Test
    void deveRetornarSomaPimentoesComSaidaFormatada(){
        //given
        int A = 11, B = 7, X = A + B;
        //when
        String somaEsperada = String.format("X = %d", X);
        //then
        String somaAtual = visitaFeira.somarPimentoes(A,B);
        Assertions.assertEquals(somaEsperada,somaAtual);
    }


}
