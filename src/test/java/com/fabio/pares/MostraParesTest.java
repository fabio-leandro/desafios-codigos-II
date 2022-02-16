package com.fabio.pares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MostraParesTest {

    private  final MostraPares mostraPares = new MostraPares();

    @Test
    void deveRetornarNumerosParesAteNumeroInformado(){
        //given
        int numero = 6;

        //when
        List<Integer> paresEsperado = new ArrayList<>();
        for (int i = 1; i <= numero; i++){
            if(i % 2 == 0) paresEsperado.add(i);
        }

        //then
        List<Integer> paresAtual = mostraPares.mostrarPares(numero);

        Assertions.assertEquals(paresEsperado,paresAtual);

    }

}
