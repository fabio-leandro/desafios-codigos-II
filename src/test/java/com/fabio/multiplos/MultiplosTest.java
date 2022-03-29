package com.fabio.multiplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplosTest {


    @Test
    @DisplayName("Deve retornar se dois números são múltiplos.")
    void deveValidarMultiplos(){

        int n1 = -6;
        int n2 = -1;

        String resposta = "";
        if (n2 % n1 == 0 || n1 % n2 == 0){
            resposta = "Sao Multiplos";
        }else {
            resposta = "Nao sao Multiplos";
        }

        String respostaAtual = Multiplos.verificar(n1,n2);
        Assertions.assertEquals(resposta,respostaAtual);
    }

}
