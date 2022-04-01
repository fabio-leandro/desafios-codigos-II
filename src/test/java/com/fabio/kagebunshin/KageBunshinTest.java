package com.fabio.kagebunshin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KageBunshinTest {


    @Test
    @DisplayName("Deve retornar a quantidade de vezes que os ninjas usaram a técnica")
    void deveRetornarQuantidadeUsadaDaTecnica(){

        int ninjas = 2;
        int quantidadeEsperada = 0;
        if (ninjas == 0 || ninjas == 1) quantidadeEsperada = 0;
        if (ninjas != 0) quantidadeEsperada = ninjas /2;

        int quantidadeAutual = KageBunshin.calcular(ninjas);
        Assertions.assertEquals(quantidadeEsperada,quantidadeAutual);

    }
}
