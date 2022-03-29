package com.fabio.encaixaounao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EncaixaOuNaoTest {


    @Test
    @DisplayName("Verifica se o segundo valor cabe na parte final do primeiro")
    void verificaEncaixeDoisValores(){

        String valor1 = "5434554";
        String valor2 = "543";
        int indiceValor1 = valor1.length() - 1;
        String resultadoEsperado = "";
        if(valor1.length() < valor2.length()){
            resultadoEsperado = "nao encaixa";
        }else {
            for (int i = valor2.length() - 1; i >= 0;i--){
                if(valor2.charAt(i) == valor1.charAt(indiceValor1)){
                    resultadoEsperado = "encaixa";
                    indiceValor1 = indiceValor1 - 1;
                }else {
                    resultadoEsperado = "nao encaixa";
                    break;
                }
            }
        }

        String resultadoAtual = EncaixaOuNao.verificar(valor1, valor2);
        Assertions.assertEquals(resultadoEsperado,resultadoAtual);


    }
}
